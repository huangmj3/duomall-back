package com.huangmaojie.duomall.cart.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.cart.entity.Cart;
import com.huangmaojie.duomall.cart.entity.CartItem;
import com.huangmaojie.duomall.cart.entity.Result;
import com.huangmaojie.duomall.cart.entity.StatusCode;
import com.huangmaojie.duomall.cart.service.CartService;
import com.huangmaojie.duomall.cart.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 购物车控制器
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@CrossOrigin
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 新增购物车商品信息
     */
    @RequestMapping(value = "/addCartGoods", method = RequestMethod.POST)
    public Result addGoods(@RequestBody Cart cart) {
        cart.setId(new IdWorker().nextId() + "");
        cart.setVersion(0L);
        cartService.addGoods(cart);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改购物车商品信息
     */
    @RequestMapping(value = "/updateCartGoods", method = RequestMethod.POST)
    public Result updateGoods(@RequestBody Cart cart) {
        cartService.updateGoods(cart);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 删除购物车商品
     */
    @RequestMapping(value = "/deleteCartGoods", method = RequestMethod.DELETE)
    public Result deleteGoods(@RequestParam String userId, @RequestParam String goodsId) {
        cartService.deleteGoods(userId, goodsId);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    /**
     * 查询用户购物车清单
     */
    @RequestMapping(value = "/listCart", method = RequestMethod.GET)
    public PageInfo<CartItem> getGoodsList(@RequestParam String userId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "100") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return cartService.selectCartByUserId(userId);
    }

    /**
     * 获得购物车内商品总价
     *
     * @return
     */
    @RequestMapping(value = "/getCartTotalPrice", method = RequestMethod.GET)
    public String getTotalPrice(@RequestParam String userId) {
        BigDecimal totalPrice = cartService.getTotalPrice(userId);
//        DecimalFormat doubleFormat = new DecimalFormat("0.00");
        return totalPrice.toString();
    }
}
