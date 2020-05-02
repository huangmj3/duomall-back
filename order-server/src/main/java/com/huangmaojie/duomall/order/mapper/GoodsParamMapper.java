package com.huangmaojie.duomall.order.mapper;

import com.huangmaojie.duomall.order.entity.GoodsParam;
import com.huangmaojie.duomall.order.entity.GoodsParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    long countByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int deleteByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int insert(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int insertSelective(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    List<GoodsParam> selectByExample(GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    GoodsParam selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsParam record, @Param("example") GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int updateByExample(@Param("record") GoodsParam record, @Param("example") GoodsParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_param
     *
     * @mbg.generated Sat May 02 15:21:44 CST 2020
     */
    int updateByPrimaryKey(GoodsParam record);
}