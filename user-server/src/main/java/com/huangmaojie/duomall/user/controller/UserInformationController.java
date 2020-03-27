package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangmaojie
 * @date 2020/3/25
 */
@RestController
@RequestMapping("/information")
@CrossOrigin
public class UserInformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping(value = "/basic",method = RequestMethod.POST)
    public Result updateBasicInformation(User user){
        informationService.updateUserBasicInformation(user);
        return new Result(true, StatusCode.OK,"修改成功");
    }
}
