package com.huangmaojie.duomall.user.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.Address;

/**
 * 用户地址服务接口
 *
 * @author huangmaojie
 * @date 2020/5/13
 */
public interface AddressService {
    /**
     * 新增地址信息
     *
     * @param address 地址信息
     */
    void addAddress(Address address);

    /**
     * 修改地址信息
     *
     * @param address 地址信息
     */
    void updateAddress(Address address);

    /**
     * 删除地址信息
     *
     * @param addressId 地址id
     */
    void deleteAddress(String addressId);

    /**
     * 根据用户id查询全部地址信息
     *
     * @param userId 用户id
     * @return 带分页信息的订单信息列表
     */
    PageInfo<Address> selectAddressByUserId(String userId);
}
