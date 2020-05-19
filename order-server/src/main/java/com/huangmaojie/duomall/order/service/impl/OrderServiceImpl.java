package com.huangmaojie.duomall.order.service.impl;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.order.entity.OrderInformation;
import com.huangmaojie.duomall.order.entity.OrderInformationExample;
import com.huangmaojie.duomall.order.mapper.OrderInformationMapper;
import com.huangmaojie.duomall.order.mapper.extension.OrderInformationExtMapper;
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
    private OrderInformationMapper orderInformationMapper;

    @Autowired
    private OrderInformationExtMapper orderInformationExtMapper;

    /**
     * 新增订单
     * @param order 订单信息
     */
    @Override
    public void addOrder(OrderInformation order){
        orderInformationMapper.insert(order);
    }

    /**
     * 修改订单信息
     * @param order 新的订单信息
     */
    @Override
    public void updateOrder(OrderInformation order){
        OrderInformationExample orderExample = new OrderInformationExample();
        orderExample.createCriteria()
            .andIdEqualTo(order.getId());
        order.setId(null);
        orderInformationMapper.updateByExampleSelective(order,orderExample);
    }

    /**
     * 删除订单
     * @param orderId 订单id
     */
    @Override
    public void deleteOrder(String orderId){
        orderInformationMapper.deleteByPrimaryKey(orderId);
    }

    /**
     * 根据用户id，查找全部订单
     * @param userId 用户id
     * @return 带有分页的订单信息
     */
    @Override
    public PageInfo<OrderInformation> selectOrderByUserId(String userId){
        OrderInformationExample orderExample = new OrderInformationExample();
        orderExample.createCriteria()
                .andUserIdEqualTo(userId);
        PageInfo<OrderInformation> orderInfo = new PageInfo<>(orderInformationExtMapper.selectByExample(orderExample));
        return orderInfo;
    }
}
