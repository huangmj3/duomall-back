package com.huangmaojie.duomall.order.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.order.entity.OrderInformation;
import com.huangmaojie.duomall.order.entity.Result;
import com.huangmaojie.duomall.order.entity.StatusCode;
import com.huangmaojie.duomall.order.service.OrderService;
import com.huangmaojie.duomall.order.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 订单控制器
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@RestController
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class OrderController {

    @Autowired(required = false)
    private OrderService orderService;

    /**
     * 新增订单
     */
    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public Result addOrder(@RequestBody OrderInformation orderInformation) {
        orderInformation.setId(new IdWorker().nextId() + "");
        orderInformation.setVersion(0L);
        orderService.addOrder(orderInformation);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改订单信息
     */
    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public Result updateGoods(@RequestBody OrderInformation orderInformation) {
        orderService.updateOrder(orderInformation);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 根据用户id，查找全部订单
     */
    @RequestMapping(value = "/listOrder", method = RequestMethod.GET)
    public PageInfo<OrderInformation> getGoodsList(@RequestParam String userId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<OrderInformation> orderInformationPageInfo = orderService.selectOrderByUserId(userId);
        return orderInformationPageInfo;
    }
}
