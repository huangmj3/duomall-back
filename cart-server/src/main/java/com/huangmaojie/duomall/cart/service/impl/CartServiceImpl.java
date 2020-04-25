//package com.huangmaojie.duomall.cart.service.impl;
//
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageInfo;
//import com.google.common.collect.Lists;
//import com.huangmaojie.duomall.cart.entity.Cart;
//import com.huangmaojie.duomall.cart.entity.CartExample;
//import com.huangmaojie.duomall.cart.mapper.CartMapper;
//import com.huangmaojie.duomall.cart.mapper.extension.CartExtMapper;
//import com.huangmaojie.duomall.cart.service.CartService;
//import org.apache.commons.collections4.CollectionUtils;
//import org.apache.commons.collections4.MapUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * 购物车服务实现类
// *
// * @author huangmaojie
// * @date 2020/3/28
// */
//@Service
//public class CartServiceImpl implements CartService {
//
//    @Autowired
//    private CartMapper cartMapper;
//
//    @Autowired
//    private CartExtMapper cartExtMapper;
//
//    /**
//     * 购物车内新增商品
//     * @param cart 购物车商品信息
//     */
//    @Override
//    public void addGoods(Cart cart){
//        cartMapper.insert(cart);
//    }
//
//    /**
//     * 修改购物车商品信息
//     * @param cart 新的商品信息
//     */
//    @Override
//    public void updateGoods(Cart cart){
//        CartExample cartExample = new CartExample();
//        cartExample.createCriteria()
//            .andIdEqualTo(cart.getId());
//        cart.setId(null);
//        cartMapper.updateByExampleSelective(cart,cartExample);
//    }
//
//    /**
//     * 删除购物车商品
//     * @param cartId 购物车id
//     */
//    @Override
//    public void deleteGoods(String cartId){
//        cartMapper.deleteByPrimaryKey(cartId);
//    }
//
//    /**
//     * 根据用户id，查找全部购物车商品
//     * @param uid 用户id
//     * @return 带有分页的购物车信息
//     */
//    @Override
//    public  PageInfo<Cart> selectCartByUid(String uid){
//        CartExample cartExample = new CartExample();
//        cartExample.createCriteria()
//                .andUidEqualTo(uid);
//        PageInfo<Cart> cartInfo = new PageInfo<>(cartExtMapper.selectByExample(cartExample));
//        return cartInfo;
//    }
//
//    /**
//     * 计算购物车内商品的总价
//     */
//    @Override
//    public double getTotalPrice(String uid){
//        double totalPrice = 0;
//        CartExample cartExample = new CartExample();
//        cartExample.createCriteria()
//                .andUidEqualTo(uid);
//        Page<Cart> carts = cartExtMapper.selectByExample(cartExample);
//        if(carts != null && CollectionUtils.isNotEmpty(carts.getResult())){
//            List<Cart> foundCart = carts.getResult();
//            List<Integer> goodsNums = foundCart.stream().map(Cart::getGoodsNum).collect(Collectors.toList());
//            List<Double> goodsUnitPrice = foundCart.stream().map(Cart::getGoodsUnitPrice).collect(Collectors.toList());
//            for (int i = 0; i < goodsNums.size(); i++) {
//                totalPrice += (goodsNums.get(i) * goodsUnitPrice.get(i));
//            }
//        }
//        return totalPrice;
//    }
//}
