package com.huangmaojie.duomall.goods.service.impl;

import com.huangmaojie.duomall.goods.entity.SpikeGoods;
import com.huangmaojie.duomall.goods.entity.SpikeGoodsExample;
import com.huangmaojie.duomall.goods.entity.SpikeGoodsResponse;
import com.huangmaojie.duomall.goods.mapper.GoodsMapper;
import com.huangmaojie.duomall.goods.mapper.SpikeGoodsMapper;
import com.huangmaojie.duomall.goods.mapper.extension.SpikeGoodsExtMapper;
import com.huangmaojie.duomall.goods.service.SpikeGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @author huangmaojie
 * @date 2020/3/28
 */
@Service
@Validated
public class SpikeGoodsServiceImpl implements SpikeGoodsService {

    @Autowired(required = false)
    private SpikeGoodsMapper spikeGoodsMapper;

    @Autowired(required = false)
    private SpikeGoodsExtMapper spikeGoodsExtMapper;

    /**
     * 获取秒杀商品信息
     */
    @Override
    public List<SpikeGoods> getSpikeGoods() {
        return spikeGoodsExtMapper.selectAll();
    }

    /**
     * 修改秒杀商品数量信息
     */
    @Override
    public void updateSpikeGoodsNum(String goodsId, int goodsNum) {

    }
}
