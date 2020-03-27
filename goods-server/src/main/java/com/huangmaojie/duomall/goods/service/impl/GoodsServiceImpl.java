package com.huangmaojie.duomall.goods.service.impl;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsExample;
import com.huangmaojie.duomall.goods.mapper.GoodsMapper;
import com.huangmaojie.duomall.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品服务类
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 根据关键词查找商品
     */
    @Override
    public Page<Goods> findGoodsByKey(String key) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria()
                .andNameLike(key);
        Page<Goods> foundGoods = goodsMapper.selectByExample(goodsExample);
        return foundGoods;
    }
}
