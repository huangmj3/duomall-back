package com.huangmaojie.duomall.order.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.order.entity.Comment;
import com.huangmaojie.duomall.order.entity.CommentExample;

/**
 * Comment扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface CommentExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Comment> selectByExample(CommentExample example);

}
