package com.huangmaojie.duomall.user.service;

import com.huangmaojie.duomall.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author huangmaojie
 * @date 2020/3/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testAddNormalUser() {
        User user = new User();
        user.setId("normalUser11q1");
        user.setCellphone("18292493938");
        user.setLoginPassword("123456");
        user.setPaymentPassword("123456");
        user.setName("六七");
        user.setAvatar("");
        user.setSex("男");
        user.setBirthday(new Date(System.currentTimeMillis()));
        user.setIsProductManager(false);
        user.setIsLogisticManager(false);
        user.setStatus(1);
        user.setGmtCreate(new Date(System.currentTimeMillis()));
        user.setGmtModified(new Date(System.currentTimeMillis()));
        user.setVersion(0L);
        userService.addNormalUser(user);
        System.out.println(1);
    }
}
