package com.huangmaojie.duomall.goods.service;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsImage;
import com.huangmaojie.duomall.goods.entity.GoodsParam;
import com.huangmaojie.duomall.goods.entity.GoodsSetMeal;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * 通用商品服务接口
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Validated
public interface CommonGoodsService {

    /**
     * 根绝关键词寻找商品
     * @param key 关键词
     * @return 寻找结果
     */
    public Page<Goods> findGoodsByKey(@NotEmpty String key);

    /**
     * 根据商品id查找商品概要信息
     *
     * @param id 商品id
     * @return 商品概要信息
     */
    public Goods findGoodsById(@NotEmpty String id);

    /**
     * 根据商品id查找商品图片信息
     *
     * @param goodsId 商品id
     * @return 商品图片信息
     */
    public GoodsImage findGoodsImageByGoodsId(@NotEmpty String goodsId);

    /**
     * 根据商品id寻找商品参数信息
     *
     * @param goodsId 商品id
     * @return 商品参数信息
     */
    public GoodsParam findGoodsParamByGoodsId(@NotEmpty String goodsId);

    /**
     * 根据商品id寻找商品套餐信息
     *
     * @param goodsId 商品id
     * @return 商品套餐信息
     */
    public GoodsSetMeal findGoodsSetMealByGoodsId(@NotEmpty String goodsId);

}
