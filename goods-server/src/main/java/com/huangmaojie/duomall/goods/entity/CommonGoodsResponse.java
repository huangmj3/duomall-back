package com.huangmaojie.duomall.goods.entity;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

/**
 * 通用商品响应实体类
 *
 * @author huangmaojie
 * @date 2020/5/20
 */
@Data
public class CommonGoodsResponse {
    /**
     * 通用商品概要数据
     */
    PageInfo<Goods> goodsList;

    /**
     * 通用商品图片数据
     */
    List<List<GoodsImage>> goodsImageList;

    /**
     * 通用商品参数数据
     */
    List<List<GoodsParam>> goodsParamList;

    /**
     * 通用商品套餐数据
     */
    List<List<GoodsSetMeal>> goodsSetMealList;
}
