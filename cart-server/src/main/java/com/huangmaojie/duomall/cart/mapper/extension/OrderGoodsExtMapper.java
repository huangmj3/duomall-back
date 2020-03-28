package com.huangmaojie.duomall.cart.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.cart.entity.OrderGoods;
import com.huangmaojie.duomall.cart.entity.OrderGoodsExample;

/**
 * OrderGoods扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface OrderGoodsExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<OrderGoods> selectByExample(OrderGoodsExample example);

}
