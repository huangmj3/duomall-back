package com.huangmaojie.duomall.cart.service.impl;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.huangmaojie.duomall.cart.client.GoodsClient;
import com.huangmaojie.duomall.cart.entity.*;
import com.huangmaojie.duomall.cart.mapper.CartMapper;
import com.huangmaojie.duomall.cart.mapper.extension.CartExtMapper;
import com.huangmaojie.duomall.cart.service.CartService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 购物车服务实现类
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired(required = false)
    private CartMapper cartMapper;

    @Autowired(required = false)
    private CartExtMapper cartExtMapper;

    @Autowired(required = false)
    private GoodsClient goodsClient;

    /**
     * 购物车内新增商品
     *
     * @param cart 购物车商品信息
     */
    @Override
    public void addGoods(Cart cart) {
        cartMapper.insert(cart);
    }

    /**
     * 修改购物车商品信息
     *
     * @param cart 新的商品信息
     */
    @Override
    public void updateGoods(Cart cart) {
        CartExample cartExample = new CartExample();
        cartExample.createCriteria()
                .andUserIdEqualTo(cart.getUserId())
                .andGoodsIdEqualTo(cart.getGoodsId());
        cart.setId(null);
        cartMapper.updateByExampleSelective(cart, cartExample);
    }

    /**
     * 删除购物车商品
     *
     * @param userId  用户id
     * @param goodsId 购物车id
     */
    @Override
    public void deleteGoods(String userId, String goodsId) {
        //根据userId,goodsId找到对应的cartId
        CartExample cartExample = new CartExample();
        cartExample.createCriteria()
                .andUserIdEqualTo(userId)
                .andGoodsIdEqualTo(goodsId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        if (CollectionUtils.isNotEmpty(carts)) {
            //删除购物车内的商品
            cartMapper.deleteByPrimaryKey(carts.get(0).getId());
        }
    }

    /**
     * 根据用户id，查找全部购物车商品
     *
     * @param userId 用户id
     * @return 带有分页的购物车信息
     */
    @Override
    public PageInfo<CartItem> selectCartByUserId(String userId) {
        CartExample cartExample = new CartExample();
        cartExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        List<String> goodsIds = Lists.transform(carts, it -> it.getGoodsId());
        List<Integer> goodsNums = Lists.transform(carts, it -> it.getGoodsNum());
        //封装商品信息
        List<CartItem> cartItemList = new ArrayList<>();
        for (int i = 0; i < goodsIds.size(); i++) {
            CartItem cartItem = new CartItem();
            Goods goods = goodsClient.getGoodsById(goodsIds.get(i));
            GoodsImage goodsImage = goodsClient.getGoodsImageByGoodsId(goodsIds.get(i));
            GoodsSetMeal goodsSetMeal = goodsClient.getGoodsSetMealByGoodsId(goodsIds.get(i));
            cartItem.setGoodsId(goodsIds.get(i));
            cartItem.setGoodsTitle(goods.getTitle());
            cartItem.setGoodsNum(goodsNums.get(i));
            cartItem.setGoodsImage(goodsImage.getImage());
            cartItem.setGoodsPrice(goods.getDiscountPrice());
            cartItem.setGoodsSetMealIntro(goodsSetMeal.getIntro());
            cartItemList.add(cartItem);
        }
        PageInfo page = new PageInfo(cartItemList);
        return page;
    }

    /**
     * 计算购物车内商品的总价
     */
    @Override
    public BigDecimal getTotalPrice(String userId) {
        BigDecimal totalPrice = new BigDecimal(Double.valueOf(0));
        //  获取商品信息
        CartExample cartExample = new CartExample();
        cartExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        List<String> goodsIds = Lists.transform(carts, it -> it.getGoodsId());
        List<Integer> goodsNums = Lists.transform(carts, it -> it.getGoodsNum());
        //  计算商品总价
        for (int i = 0; i < goodsIds.size(); i++) {
            Goods goods = goodsClient.getGoodsById(goodsIds.get(i));
            BigDecimal goodNum = new BigDecimal(Double.valueOf(goodsNums.get(i)));
            BigDecimal unitPrice = goods.getDiscountPrice().multiply(goodNum);
            totalPrice = totalPrice.add(unitPrice);
        }
        return totalPrice;
    }
}
