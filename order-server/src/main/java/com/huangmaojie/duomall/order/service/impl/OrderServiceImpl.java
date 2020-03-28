package com.huangmaojie.duomall.order.service.impl;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.order.entity.Order;
import com.huangmaojie.duomall.order.entity.OrderExample;
import com.huangmaojie.duomall.order.mapper.OrderMapper;
import com.huangmaojie.duomall.order.mapper.extension.OrderExtMapper;
import com.huangmaojie.duomall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单服务实现类
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderExtMapper orderExtMapper;

    /**
     * 新增订单
     * @param order 订单信息
     */
    @Override
    public void addOrder(Order order){
        orderMapper.insert(order);
    }

    /**
     * 修改订单信息
     * @param order 新的订单信息
     */
    @Override
    public void updateOrder(Order order){
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria()
            .andIdEqualTo(order.getId());
        order.setId(null);
        orderMapper.updateByExampleSelective(order,orderExample);
    }

    /**
     * 删除订单
     * @param orderId 订单id
     */
    @Override
    public void deleteOrder(String orderId){
        orderMapper.deleteByPrimaryKey(orderId);
    }

    /**
     * 根据用户id，查找全部订单
     * @param uid 用户id
     * @return 带有分页的订单信息
     */
    @Override
    public PageInfo<Order> selectOrderByUid(String uid){
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria()
                .andUidEqualTo(uid);
        PageInfo<Order> orderInfo = new PageInfo<>(orderExtMapper.selectByExample(orderExample));
        return orderInfo;
    }
}
