package com.huangmaojie.duomall.user.service.impl;

import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.mapper.UserMapper;
import com.huangmaojie.duomall.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;

/**
 * @author huangmaojie
 * @date 2020/3/11
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private SqlSessionTemplate duomallSqlSessionTemplate;


    /**
     * 增加普通用户
     * @oaram user 用户信息
     */
    @Override
    public void addNormalUser(User user) {
//        User user = new User();
        userMapper.insert(user);
    }

    /**
     * 增加用户管理员用户
     * @param user 用户信息
     */
    @Override
    public void addUserManager(User user) {

    }

    /**
     * 增加产品管理员用户
     * @param user 用户信息
     */
    @Override
    public void addProductManager(User user) {

    }

    /**
     * 增加物流管理员用户
     * @param user 用户信息
     */
    @Override
    public void addLogisticManager(User user) {

    }

    /**
     * 删除用户
     */
    @Override
    public void deleteUser(@NotEmpty String userId) {

    }

    /**
     * 更新用户信息
     */
    @Override
    public void updateUser(@NotEmpty String userId) {

    }

    /**
     * 根据用户名查找用户
     */
    @Override
    public void getUserByKey(@NotEmpty String userId) {

    }

    /**
     * 根绝用户名和用户信息查找用户
     */
    @Override
    public void getUserByInformation(@NotEmpty String userId, User user) {

    }
}
