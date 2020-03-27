package com.huangmaojie.duomall.cart.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.cart.entity.Cart;

/**
 * 购物车服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface CartService {

    void addGoods(Cart cart);

    void updateGoods(Cart cart);

    void deleteGoods(String cartId);

    PageInfo<Cart> selectCartByUid(String uid);

    double getTotalPrice(String uid);
}
