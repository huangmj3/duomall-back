package com.huangmaojie.duomall.user.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.user.entity.OrderGoods;
import com.huangmaojie.duomall.user.entity.OrderGoodsExample;

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
