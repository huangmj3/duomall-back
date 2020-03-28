package com.huangmaojie.duomall.user.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.user.entity.Logistics;
import com.huangmaojie.duomall.user.entity.LogisticsExample;

/**
 * Logistics扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface LogisticsExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Logistics> selectByExample(LogisticsExample example);

}
