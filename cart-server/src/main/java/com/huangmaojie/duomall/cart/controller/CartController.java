//package com.huangmaojie.duomall.cart.controller;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.huangmaojie.duomall.cart.entity.Cart;
//import com.huangmaojie.duomall.cart.entity.Result;
//import com.huangmaojie.duomall.cart.entity.StatusCode;
//import com.huangmaojie.duomall.cart.service.CartService;
//import com.huangmaojie.duomall.cart.util.IdWorker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.text.DecimalFormat;
//
///**
// * 购物车控制器
// *
// * @author huangmaojie
// * @date 2020/3/28
// */
//@CrossOrigin
//@RestController
//public class CartController {
//
//    @Autowired
//    private CartService cartService;
//
//    /**
//     * 向购物车内添加商品
//     */
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public Result addGoods(@RequestBody Cart cart) {
//        cart.setId(new IdWorker().nextId() + "");
//        cart.setVersion(0L);
//        cartService.addGoods(cart);
//        return new Result(true, StatusCode.OK, "添加成功");
//    }
//
//    /**
//     * 修改购物车商品信息
//     */
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public Result updateGoods(@RequestBody Cart cart) {
//        cartService.updateGoods(cart);
//        return new Result(true, StatusCode.OK, "修改成功");
//    }
//
//    /**
//     * 获得购物车清单
//     */
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public PageInfo<Cart> getGoodsList(@RequestParam String uid,@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "1") int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        PageInfo<Cart> cartPageInfo = cartService.selectCartByUid(uid);
//        return cartPageInfo;
//    }
//
//    /**
//     * 获得购物车内商品总价
//     * @return
//     */
//    @RequestMapping(value = "/price",method = RequestMethod.GET)
//    public String getTotalPrice(@RequestParam String uid){
//        double totalPrice = cartService.getTotalPrice(uid);
//        DecimalFormat doubleFormat = new DecimalFormat("0.00");
////        return Double.parseDouble(doubleFormat.format(totalPrice));
//        return doubleFormat.format(totalPrice);
//    }
//}
