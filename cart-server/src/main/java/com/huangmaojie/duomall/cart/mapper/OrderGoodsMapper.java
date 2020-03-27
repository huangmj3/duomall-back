package com.huangmaojie.duomall.cart.mapper;

import com.huangmaojie.duomall.cart.entity.OrderGoods;
import com.huangmaojie.duomall.cart.entity.OrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    long countByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int deleteByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int insert(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int insertSelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    List<OrderGoods> selectByExample(OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    OrderGoods selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByPrimaryKeySelective(OrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_goods
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByPrimaryKey(OrderGoods record);
}