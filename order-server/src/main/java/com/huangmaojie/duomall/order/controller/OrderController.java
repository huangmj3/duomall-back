//package com.huangmaojie.duomall.order.controller;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import com.huangmaojie.duomall.order.entity.Order;
//import com.huangmaojie.duomall.order.entity.Result;
//import com.huangmaojie.duomall.order.entity.StatusCode;
//import com.huangmaojie.duomall.order.service.OrderService;
//import org.aspectj.weaver.ast.Or;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
///**
// * 订单控制器
// *
// * @author huangmaojie
// * @date 2020/3/28
// */
//@CrossOrigin
//@RestController
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    /**
//     * 新增订单
//     */
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public Result addOrder(@RequestBody Order order) {
//        orderService.addOrder(order);
//        return new Result(true, StatusCode.OK, "添加成功");
//    }
//
//    /**
//     * 修改订单信息
//     */
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public Result updateGoods(@RequestBody Order order) {
//        orderService.updateOrder(order);
//        return new Result(true, StatusCode.OK, "修改成功");
//    }
//
//    /**
//     * 根据用户id，查找全部订单
//     */
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public PageInfo<Order> getGoodsList(@RequestParam String uid, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        PageInfo<Order> cartPageInfo = orderService.selectOrderByUid(uid);
//        return cartPageInfo;
//    }
//}
