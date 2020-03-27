package com.huangmaojie.duomall.order.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.order.entity.Order;

/**
 * 订单服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface OrderService {
    void addOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(String orderId);

    PageInfo<Order> selectOrderByUid(String uid);
}
