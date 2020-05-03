package com.huangmaojie.duomall.user.mapper;

import com.huangmaojie.duomall.user.entity.OrderInformation;
import com.huangmaojie.duomall.user.entity.OrderInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    long countByExample(OrderInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int deleteByExample(OrderInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int insert(OrderInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int insertSelective(OrderInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    List<OrderInformation> selectByExample(OrderInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    OrderInformation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrderInformation record, @Param("example") OrderInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByExample(@Param("record") OrderInformation record, @Param("example") OrderInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByPrimaryKeySelective(OrderInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_information
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    int updateByPrimaryKey(OrderInformation record);
}