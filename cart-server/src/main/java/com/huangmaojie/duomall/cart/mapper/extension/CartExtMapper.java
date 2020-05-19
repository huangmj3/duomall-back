package com.huangmaojie.duomall.cart.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.cart.entity.Cart;
import com.huangmaojie.duomall.cart.entity.CartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartExtMapper {
    /**
     * 分页信息
     *
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Cart> selectByExample(CartExample example);
}