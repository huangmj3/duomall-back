package com.huangmaojie.duomall.user.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.user.entity.Address;
import com.huangmaojie.duomall.user.entity.AddressExample;

/**
 * Address扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface AddressExtMapper {
    /**
     * 分页信息
     *
     * @param example 
     * @return 含有分页信息的列表
     */
    Page<Address> selectByExample(AddressExample example);

}
