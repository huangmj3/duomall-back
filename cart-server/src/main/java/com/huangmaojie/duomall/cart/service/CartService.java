package com.huangmaojie.duomall.cart.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.cart.entity.Cart;
import com.huangmaojie.duomall.cart.entity.CartItem;

import java.math.BigDecimal;

/**
 * 购物车服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface CartService {

    /**
     * 购物车内新增商品
     *
     * @param cart 购物车商品信息
     */
    void addGoods(Cart cart);

    /**
     * 修改购物车商品信息
     *
     * @param cart 购物车商品信息
     */
    void updateGoods(Cart cart);

    /**
     * 删除购物车商品
     *
     * @param userId 用户id
     * @param goodsId 商品id
     */
    void deleteGoods(String userId, String goodsId);

    /**
     * 根据用户id，查找全部购物车商品
     *
     * @param userId 用户id
     * @return 带有分页信息的购物车列表
     */
    PageInfo<CartItem> selectCartByUserId(String userId);

    /**
     * 计算购物车内的商品总价
     *
     * @param userId 用户id
     * @return 商品总价
     */
    BigDecimal getTotalPrice(String userId);
}
