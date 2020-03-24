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
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/register")
@CrossOrigin
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/normalUser",method = RequestMethod.POST)
    public Result save(@RequestBody User user){
        user.setId(new IdWorker().nextId()+"" );
//        user.setBirthday(new Date(System.currentTimeMillis()));
        user.setIsProductManager(false);
        user.setIsLogisticManager(false);
        user.setStatus(1);
        user.setGmtCreate(new Date(System.currentTimeMillis()));
        user.setGmtModified(new Date(System.currentTimeMillis()));
        user.setVersion(0L);
        userService.addNormalUser(user);
        return new Result(true, StatusCode.OK,  "保存成功");
    }
}
