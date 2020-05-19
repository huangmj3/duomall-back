package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户基本信息修改控制器
 *
 * @author huangmaojie
 * @date 2020/3/25
 */
@RestController
@RequestMapping("/information")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class UserInformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result updateBasicInformation(@RequestBody User user) {
        informationService.updateUserBasicInformation(user);
        return new Result(true, StatusCode.OK, "修改成功");
    }
}
