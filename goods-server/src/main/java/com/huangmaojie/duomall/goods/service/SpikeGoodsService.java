package com.huangmaojie.duomall.goods.service;

import com.huangmaojie.duomall.goods.entity.SpikeGoods;
import com.huangmaojie.duomall.goods.entity.SpikeGoodsResponse;

import java.util.List;

/**
 * 秒杀商品服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface SpikeGoodsService {

    /**
     * 获取秒杀商品信息
     *
     */
    List<SpikeGoods> getSpikeGoods();
}
