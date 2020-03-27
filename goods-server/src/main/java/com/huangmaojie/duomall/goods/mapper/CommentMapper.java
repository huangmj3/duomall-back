package com.huangmaojie.duomall.goods.mapper;

import com.huangmaojie.duomall.goods.entity.Comment;
import com.huangmaojie.duomall.goods.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    Comment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByPrimaryKey(Comment record);
}