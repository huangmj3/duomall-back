package com.huangmaojie.duomall.goods.mapper.extension;

import com.huangmaojie.duomall.goods.entity.SpikeGoods;

import java.util.List;

/**
 * SpikeGoods扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/5/2
 */
public interface SpikeGoodsExtMapper {
    /**
     * 获取全部秒杀商品信息
     */
    List<SpikeGoods> selectAll();
}
