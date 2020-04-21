package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.UserService;
import com.huangmaojie.duomall.user.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 普通用户注册控制器
 *
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/register")
@CrossOrigin
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/cellphoneVerification", method = RequestMethod.POST)
    public Result verification(@RequestBody User user) {
        User userByCellphone = userService.getUserByCellphone(user.getCellphone());
        if (userByCellphone == null) {
            return new Result(true, StatusCode.OK, "手机号可以注册",true);
        }
        return new Result(false, StatusCode.CELLPHONE_EXITS, "手机号已存在",false);
    }


    /**
     * 用户注册控制器
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result register(@RequestBody User user) {
        //根据手机号查找用户
        User foundUser = userService.getUserByCellphone(user.getCellphone());
        if (foundUser != null) {
            return new Result(false, StatusCode.CELLPHONE_EXITS, "手机号已存在");
        }
        user.setId(new IdWorker().nextId() + "");
        user.setIsProductManager(false);
        user.setIsLogisticManager(false);
        user.setStatus(1);
        user.setGmtCreate(new Date(System.currentTimeMillis()));
        user.setGmtModified(new Date(System.currentTimeMillis()));
        user.setVersion(0L);
        userService.addNormalUser(user);
        return new Result(true, StatusCode.OK, "保存成功");
    }
}
