package com.huangmaojie.duomall.user.mapper;

import com.huangmaojie.duomall.user.entity.SpikeGoods;
import com.huangmaojie.duomall.user.entity.SpikeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpikeGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    long countByExample(SpikeGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int deleteByExample(SpikeGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int insert(SpikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int insertSelective(SpikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    List<SpikeGoods> selectByExample(SpikeGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    SpikeGoods selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") SpikeGoods record, @Param("example") SpikeGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByExample(@Param("record") SpikeGoods record, @Param("example") SpikeGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByPrimaryKeySelective(SpikeGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByPrimaryKey(SpikeGoods record);
}