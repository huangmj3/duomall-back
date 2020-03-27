package com.huangmaojie.duomall.goods.mapper;

import com.huangmaojie.duomall.goods.entity.Logistics;
import com.huangmaojie.duomall.goods.entity.LogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    long countByExample(LogisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int deleteByExample(LogisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int insert(Logistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int insertSelective(Logistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    List<Logistics> selectByExample(LogisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    Logistics selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByPrimaryKeySelective(Logistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    int updateByPrimaryKey(Logistics record);
}