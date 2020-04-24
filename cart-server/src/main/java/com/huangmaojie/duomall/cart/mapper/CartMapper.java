package com.huangmaojie.duomall.cart.mapper;

import com.huangmaojie.duomall.cart.entity.Cart;
import com.huangmaojie.duomall.cart.entity.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    long countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    Cart selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sat Apr 25 03:37:41 CST 2020
     */
    int updateByPrimaryKey(Cart record);
}