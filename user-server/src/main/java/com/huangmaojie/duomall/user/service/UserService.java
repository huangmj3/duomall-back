package com.huangmaojie.duomall.user.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.user.entity.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

/**
 * 用户服务类
 *
 * @author huangmaojie
 * @date 2020/3/11
 */
@Validated
public interface UserService {
    /**
     * 增加普通用户
     *
     * @param user 用户信息
     */
    void addNormalUser(User user);

    /**
     * 增加用户管理员用户
     *
     * @param user 用户信息
     */
    void addUserManager(User user);

    /**
     * 增加商品管理员用户
     *
     * @param user 用户信息
     */
    void addProductManager(User user);

    /**
     * 增加物流管理员用户
     *
     * @param user 用户信息
     */
    void addLogisticManager(User user);

    /**
     * 删除用户
     *
     * @param userId 用户名
     */
    void deleteUser(@NotEmpty String userId);

    /**
     * 根据用户名查找用户
     *
     * @param userId 用户名
     */
    void getUserByKey(@NotEmpty String userId);

    /**
     * 根据手机号查找用户
     *
     * @param cellphone 手机号
     * @return 根据手机号查找到的用户
     */
    User getUserByCellphone(String cellphone);

    /**
     * 登录校验
     *
     * @param cellphone     手机号
     * @param loginPassword 登录密码
     * @return 验证结果，用户密码正确返回true以及该用户id，否则返回false,
     */
    Map loginVerification(@NotEmpty String cellphone, @NotEmpty String loginPassword);

    /**
     * 根据用户名和其他用户信息查找用户
     *
     * @param userId 用户名
     * @param user   用户信息
     */
    void getUserByInformation(@NotEmpty String userId, User user);

    /**
     * 查找全部用户
     *
     * @return 用户列表
     */
    PageInfo<User> getAllUsers();
}
