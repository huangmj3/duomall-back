package com.huangmaojie.duomall.cart.entity;

import com.github.pagehelper.PageInfo;
import lombok.Data;

/**
 * 购物车信息查询返回类
 *
 * @author huangmaojie
 * @date 2020/5/10
 */

@Data
public class CartResponse {

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
    String goodsNum;

    /**
     * 商品图片
     */
    String goodsImage;

    /**
     * 商品实际单价
     */
    String goodsPrice;

    /**
     * 商品套餐介绍
     */
    String goodsSetMealIntro;
}
