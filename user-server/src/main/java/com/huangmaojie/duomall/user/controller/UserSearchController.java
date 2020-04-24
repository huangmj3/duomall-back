package com.huangmaojie.duomall.user.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.PageInformation;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户查找控制器
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/search")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class UserSearchController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public PageInfo<User> findAllUsers(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userService.getAllUsers();
    }
}
