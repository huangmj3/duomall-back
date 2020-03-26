package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 *
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public Result loginByCellphone(@RequestBody User user){
        boolean validationResults = userService.loginVerification(user.getCellphone(),user.getLoginPassword());
        if (validationResults){
            return new Result(true, StatusCode.OK,  "账号密码正确", true);
        }
        return new Result(true, StatusCode.OK,  "用户名错误或手机号不存在", false);
    }
}
