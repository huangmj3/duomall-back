package com.huangmaojie.duomall.user.service.impl;

import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.entity.UserExample;
import com.huangmaojie.duomall.user.mapper.UserMapper;
import com.huangmaojie.duomall.user.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 用户信息服务实现类
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@Service
@Validated
public class InformationServiceImpl implements InformationService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 修改用户基本信息
     */
    @Override
    public void updateUserBasicInformation(User user){
        UserExample userExample = new UserExample();
        userExample.createCriteria()
            .andIdEqualTo(user.getId());
        user.setId(null);
        userMapper.updateByExampleSelective(user,userExample);
    }
}
