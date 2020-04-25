package com.huangmaojie.duomall.order.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.order.entity.OrderInformation;
import com.huangmaojie.duomall.order.entity.OrderInformationExample;

/**
 * Order扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface OrderInformationExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<OrderInformation> selectByExample(OrderInformationExample example);

}
