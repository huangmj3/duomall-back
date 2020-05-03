package com.huangmaojie.duomall.goods.service.impl;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.*;
import com.huangmaojie.duomall.goods.mapper.GoodsImageMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsParamMapper;
import com.huangmaojie.duomall.goods.mapper.GoodsSetMealMapper;
import com.huangmaojie.duomall.goods.mapper.extension.GoodsExtMapper;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 根据关键词查找商品
     */
    @Override
    public Page<Goods> findGoodsByKey(String key) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria()
                .andTitleEqualTo("%" + key + "%");
        Page<Goods> foundGoods = goodsExtMapper.selectByExample(goodsExample);
        return foundGoods;
    }

    @Override
    public Goods findGoodsById(String id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public GoodsImage findGoodsImageByGoodsId(String goodsId) {
        GoodsImageExample example = new GoodsImageExample();
        example.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        return goodsImageMapper.selectByExample(example).get(0);
    }

    @Override
    public GoodsParam findGoodsParamByGoodsId(String goodsId) {
        GoodsParamExample example = new GoodsParamExample();
        example.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        return goodsParamMapper.selectByExample(example).get(0);
    }

    @Override
    public GoodsSetMeal findGoodsSetMealByGoodsId(String goodsId) {
        GoodsSetMealExample example = new GoodsSetMealExample();
        example.createCriteria()
                .andGoodsIdEqualTo(goodsId);
        return goodsSetMealMapper.selectByExample(example).get(0);
    }
}
