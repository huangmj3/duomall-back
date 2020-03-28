package com.huangmaojie.duomall.user.service.impl;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.Constraints;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.entity.UserExample;
import com.huangmaojie.duomall.user.mapper.UserMapper;
import com.huangmaojie.duomall.user.mapper.extension.UserExtMapper;
import com.huangmaojie.duomall.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotEmpty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huangmaojie
 * @date 2020/3/11
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserExtMapper userExtMapper;

    @Override
    public User getUserByCellphone(String cellphone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andCellphoneEqualTo(cellphone);
        List<User> users = userMapper.selectByExample(userExample);
        if(CollectionUtils.isEmpty(users)){
            return null;
        }
        return users.get(0);
    }

    /**
     * 增加普通用户
     * @oaram user 用户信息
     */
    @Override
    public void addNormalUser(User user) {
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
     * 根据用户名查找用户
     */
    @Override
    public void getUserByKey(@NotEmpty String userId) {

    }

    @Override
    public Map loginVerification(@NotEmpty String cellphone, @NotEmpty String loginPassword) {
        Map result = new HashMap<String,Object>();
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andCellphoneEqualTo(cellphone)
                .andLoginPasswordEqualTo(loginPassword);
        List<User> users = userMapper.selectByExample(userExample);
        if(CollectionUtils.isEmpty(users)){
            result.put(Constraints.MATCHED,false);
        }else {
            result.put(Constraints.MATCHED,true);
            result.put(Constraints.USER_ID,users.get(0).getId());
        }
        return result;
    }

    /**
     * 根绝用户名和用户信息查找用户
     */
    @Override
    public void getUserByInformation(@NotEmpty String userId, User user) {

    }

    @Override
    public PageInfo<User>  getAllUsers() {
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        PageInfo<User> users = new PageInfo<>(userExtMapper.selectByExample(userExample));
        return users;
    }
}
