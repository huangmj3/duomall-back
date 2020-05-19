package com.huangmaojie.duomall.user.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.Address;
import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.service.AddressService;
import com.huangmaojie.duomall.user.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户地址管理控制器
 *
 * @author huangmaojie
 * @date 2020/5/13
 */
@RestController
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class AddressController {

    @Autowired(required = false)
    private AddressService addressService;

    /**
     * 新增用户地址信息
     */
    @RequestMapping(value = "/addAddress", method = RequestMethod.POST)
    public Result addAddress(@RequestBody Address address) {
        address.setId(new IdWorker().nextId() + "");
        address.setVersion(0L);
        addressService.addAddress(address);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改用户地址信息
     */
    @RequestMapping(value = "/updateAddress", method = RequestMethod.POST)
    public Result updateAddress(@RequestBody Address address) {
        addressService.updateAddress(address);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 删除用户地址信息
     */
    @RequestMapping(value = "deleteAddress", method = RequestMethod.DELETE)
    public Result deleteAddress(@RequestParam String addressId) {
        addressService.deleteAddress(addressId);
        return new Result(true, StatusCode.OK, "删除成功");
    }

    /**
     * 根据用户id，查找全部用户地址信息
     */
    @RequestMapping(value = "/listAddress", method = RequestMethod.GET)
    public PageInfo<Address> getGoodsList(@RequestParam String userId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Address> addressPageInfo = addressService.selectAddressByUserId(userId);
        return addressPageInfo;
    }
}
