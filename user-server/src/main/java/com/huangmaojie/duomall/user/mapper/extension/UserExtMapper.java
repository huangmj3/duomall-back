package com.huangmaojie.duomall.user.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.entity.UserExample;

/**
 * User扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface UserExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<User> selectByExample(UserExample example);

}
