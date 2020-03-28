package com.huangmaojie.duomall.user.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.user.entity.Cart;
import com.huangmaojie.duomall.user.entity.CartExample;

/**
 * Cart扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface CartExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Cart> selectByExample(CartExample example);

}
