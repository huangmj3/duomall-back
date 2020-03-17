package com.huangmaojie.duomall.user.service;

import com.huangmaojie.duomall.user.entity.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * @author huangmaojie
 * @date 2020/3/11
 */
@Validated
public interface UserService {
    /**
     * 增加普通用户
     * @param user 用户信息
     */
    void addNormalUser(User user);
    /**
     * 增加用户管理员用户
     * @param user 用户信息
     */
    void addUserManager(User user);
    /**
     * 增加商品管理员用户
     * @param user 用户信息
     */
    void addProductManager(User user);
    /**
     * 增加物流管理员用户
     * @param user 用户信息
     */
    void addLogisticManager(User user);
    /**
     * 删除用户
     * @param userId 用户名
     */
    void deleteUser(@NotEmpty String userId);
    /**
     * 修改用户
     * @param userId 用户名
     */
    void updateUser(@NotEmpty String userId);
    /**
     * 根据用户名查找用户
     * @param userId 用户名
     */
    void getUserByKey(@NotEmpty String userId);
    /**
     * 根据用户名和其他用户信息查找用户
     * @param userId 用户名
     * @param user 用户信息
     */
    void getUserByInformation(@NotEmpty String userId, User user);
}
