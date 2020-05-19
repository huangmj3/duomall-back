package com.huangmaojie.duomall.cart.entity;

import com.github.pagehelper.PageInfo;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 购物车内单个商品信息类
 *
 * @author huangmaojie
 * @date 2020/5/10
 */

@Data
public class CartItem {

    /**
     * 商品id
     */
    String goodsId;

    /**
     * 商品标题
     */
    String goodsTitle;

    /**
     * 商品数量
     */
    Integer goodsNum;

    /**
     * 商品图片
     */
    String goodsImage;

    /**
     * 商品实际单价
     */
    BigDecimal goodsPrice;

    /**
     * 商品套餐介绍
     */
    String goodsSetMealIntro;
}
