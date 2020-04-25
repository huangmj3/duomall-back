package com.huangmaojie.duomall.order.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.order.entity.OrderInformation;

/**
 * 订单服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface OrderService {
    void addOrder(OrderInformation order);

    void updateOrder(OrderInformation order);

    void deleteOrder(String orderId);

    PageInfo<OrderInformation> selectOrderByUid(String uid);
}
