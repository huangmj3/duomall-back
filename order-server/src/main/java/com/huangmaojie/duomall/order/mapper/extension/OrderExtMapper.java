package com.huangmaojie.duomall.order.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.order.entity.Order;
import com.huangmaojie.duomall.order.entity.OrderExample;

/**
 * Order扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface OrderExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Order> selectByExample(OrderExample example);

}
