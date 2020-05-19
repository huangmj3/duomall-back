package com.huangmaojie.duomall.user.service.impl;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.Address;
import com.huangmaojie.duomall.user.entity.AddressExample;
import com.huangmaojie.duomall.user.mapper.AddressMapper;
import com.huangmaojie.duomall.user.mapper.extension.AddressExtMapper;
import com.huangmaojie.duomall.user.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户地址服务实现类
 *
 * @author huangmaojie
 * @date 2020/5/13
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressExtMapper addressExtMapper;

    /**
     * 新增用户地址信息
     * @param address 用户地址信息
     */
    @Override
    public void addAddress(Address address){
        addressMapper.insert(address);
    }

    /**
     * 修改用户地址信息
     * @param address 新的用户地址信息
     */
    @Override
    public void updateAddress(Address address){
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andIdEqualTo(address.getId());
        address.setId(null);
        addressMapper.updateByExampleSelective(address,addressExample);
    }

    /**
     * 删除用户地址信息
     * @param addressId 用户地址信息id
     */
    @Override
    public void deleteAddress(String addressId){
        addressMapper.deleteByPrimaryKey(addressId);
    }

    /**
     * 根据用户id，查找全部地址信息
     * @param userId 用户id
     * @return 带有分页的用户地址细腻些
     */
    @Override
    public PageInfo<Address> selectAddressByUserId(String userId){
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria()
                .andUserIdEqualTo(userId);
        PageInfo<Address> addressInfo = new PageInfo<>(addressExtMapper.selectByExample(addressExample));
        return addressInfo;
    }
}
