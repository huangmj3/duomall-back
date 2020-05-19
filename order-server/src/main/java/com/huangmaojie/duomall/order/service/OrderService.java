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
    /**
     * 新增订单
     *
     * @param orderInformation 订单数据
     */
    void addOrder(OrderInformation orderInformation);

    /**
     * 修改订单信息
     *
     * @param orderInformation 订单数据
     */
    void updateOrder(OrderInformation orderInformation);

    /**
     * 删除订单
     *
     * @param orderId 订单id
     */
    void deleteOrder(String orderId);

    /**
     * 根据用户id查询全部订单信息
     *
     * @param userId 用户id
     * @return 带分页信息的订单信息列表
     */
    PageInfo<OrderInformation> selectOrderByUserId(String userId);
}
