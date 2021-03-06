package com.huangmaojie.duomall.user.mapper;

import com.huangmaojie.duomall.user.entity.GoodsParam;
import com.huangmaojie.duomall.user.entity.GoodsParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    long countByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int deleteByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int insert(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int insertSelective(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    List<GoodsParam> selectByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    GoodsParam selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsParam record, @Param("example") GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int updateByExample(@Param("record") GoodsParam record, @Param("example") GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sun Jun 21 19:04:36 CST 2020
     */
    int updateByPrimaryKey(GoodsParam record);
}