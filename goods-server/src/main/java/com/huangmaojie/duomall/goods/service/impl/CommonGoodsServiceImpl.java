package com.huangmaojie.duomall.goods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.*;
import com.huangmaojie.duomall.goods.mapper.GoodsImageMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsParamMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsSetMealMapper;
import com.huangmaojie.duomall.goods.mapper.extension.GoodsExtMapper;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * 通用商品服务类
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Service
public class CommonGoodsServiceImpl implements CommonGoodsService {

    @Autowired(required = false)
    private GoodsMapper goodsMapper;

    @Autowired(required = false)
    private GoodsImageMapper goodsImageMapper;

    @Autowired(required = false)
    private GoodsParamMapper goodsParamMapper;

    @Autowired(required = false)
    private GoodsSetMealMapper goodsSetMealMapper;

    @Autowired(required = false)
    private GoodsExtMapper goodsExtMapper;

    @Override
    public Goods findGoodsById(String goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public List<GoodsImage> findGoodsImageByGoodsId(String goodsId) {
        GoodsImageExample goodsImageExample = new GoodsImageExample();
        goodsImageExample.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        List<GoodsImage> goodsImages = goodsImageMapper.selectByExample(goodsImageExample);
        if (CollectionUtils.isEmpty(goodsImages)) {
            return null;
        } else {
            return goodsImages;
        }
    }

    @Override
    public List<GoodsParam> findGoodsParamByGoodsId(String goodsId) {
        GoodsParamExample goodsParamExample = new GoodsParamExample();
        goodsParamExample.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        List<GoodsParam> goodsParams = goodsParamMapper.selectByExample(goodsParamExample);
        if (CollectionUtils.isEmpty(goodsParams)) {
            return null;
        } else {
            return goodsParams;
        }
    }

    @Override
    public List<GoodsSetMeal> findGoodsSetMealByGoodsId(String goodsId) {
        GoodsSetMealExample goodsSetMealExample = new GoodsSetMealExample();
        goodsSetMealExample.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        List<GoodsSetMeal> goodsSetMeals = goodsSetMealMapper.selectByExample(goodsSetMealExample);
        if (CollectionUtils.isEmpty(goodsSetMeals)) {
            return null;
        } else {
            return goodsSetMeals;
        }
    }

    /**
     * 根据关键词查找商品
     */
    @Override
    public Page<Goods> findGoodsByKey(String key) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria()
                .andTitleLike(key);
        Page<Goods> goods = goodsExtMapper.selectByExample(goodsExample);
        return goods;
    }

    /**
     * 根据商品类型查找商品
     */
    @Override
    public Page<Goods> findGoodsByType(String type) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.or()
                .andTypeLike(type);
        Page<Goods> goods = goodsExtMapper.selectByExample(goodsExample);
        return goods;
    }

    @Override
    public CommonGoodsResponse findAllInfo(PageInfo<Goods> goodsList) {
        CommonGoodsResponse response = new CommonGoodsResponse();

        List<List<GoodsImage>> goodsImageList = new ArrayList<>();
        List<List<GoodsParam>> goodsParamList = new ArrayList<>();
        List<List<GoodsSetMeal>> goodsSetMealList = new ArrayList<>();

        for (int i = 0; i < goodsList.getList().size(); i++) {
            String goodsId = goodsList.getList().get(i).getId();
            List<GoodsImage> goodsImage = this.findGoodsImageByGoodsId(goodsId);
            goodsImageList.add(goodsImage);
            List<GoodsParam> goodsParam = this.findGoodsParamByGoodsId(goodsId);
            goodsParamList.add(goodsParam);
            List<GoodsSetMeal> goodsSetMeal = this.findGoodsSetMealByGoodsId(goodsId);
            goodsSetMealList.add(goodsSetMeal);
        }
        response.setGoodsList(goodsList);
        response.setGoodsImageList(goodsImageList);
        response.setGoodsParamList(goodsParamList);
        response.setGoodsSetMealList(goodsSetMealList);
        return response;
    }
}
