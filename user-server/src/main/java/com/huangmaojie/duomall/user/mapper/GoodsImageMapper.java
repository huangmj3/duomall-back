package com.huangmaojie.duomall.user.mapper;

import com.huangmaojie.duomall.user.entity.GoodsImage;
import com.huangmaojie.duomall.user.entity.GoodsImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    long countByExample(GoodsImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int deleteByExample(GoodsImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int insert(GoodsImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int insertSelective(GoodsImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    List<GoodsImage> selectByExample(GoodsImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    GoodsImage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int updateByExample(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_image
     *
     * @mbg.generated Sat May 02 13:41:44 CST 2020
     */
    int updateByPrimaryKey(GoodsImage record);
}