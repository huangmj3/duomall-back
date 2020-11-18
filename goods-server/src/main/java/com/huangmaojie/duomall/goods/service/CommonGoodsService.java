package com.huangmaojie.duomall.goods.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 通用商品服务接口
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Validated
public interface CommonGoodsService {
    /**
     * 根据商品id查询商品概要信息
     *
     * @param goodsId
     * @return 商品概要信息
     */
    Goods findGoodsById(@NotEmpty String goodsId);

    /**
     * 根据商品id查询商品图片信息
     *
     * @param goodsId
     * @return 商品图片信息
     */
    List<GoodsImage> findGoodsImageByGoodsId(@NotEmpty String goodsId);

    /**
     * 根据商品id查询商品参数信息
     *
     * @param goodsId
     * @return 商品参数信息
     */
    List<GoodsParam> findGoodsParamByGoodsId(@NotEmpty String goodsId);

    /**
     * 根据商品id查询商品套餐信息
     *
     * @param goodsId
     * @return 商品套餐信息
     */
    List<GoodsSetMeal> findGoodsSetMealByGoodsId(@NotEmpty String goodsId);

    /**
     * 根绝关键词搜索商品
     *
     * @param key 关键词
     * @return 搜索结果
     */
    Page<Goods> findGoodsByKey(@NotEmpty String key);

    /**
     * 根据商品类型搜索商品
     *
     * @param type 商品类型
     * @return 搜索结果
     */
    Page<Goods> findGoodsByType(@NotEmpty String type);

    /**
     * 找到商品列表的全部信息（概要信息、图片信息、参数信息、套餐信息）
     *
     * @param goodsList 商品列表
     * @return 通用商品响应实体类
     */
    CommonGoodsResponse findAllInfo(PageInfo<Goods> goodsList);
}
