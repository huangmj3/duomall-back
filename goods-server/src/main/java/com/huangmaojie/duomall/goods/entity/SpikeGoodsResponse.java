package com.huangmaojie.duomall.goods.entity;

import lombok.Data;

import java.util.List;

/**
 * 秒杀商品响应实体类
 *
 * @author huangmaojie
 * @date 2020/5/2
 */
@Data
public class SpikeGoodsResponse {
    /**
     * 秒杀商品概要数据
     */
    List<Goods> goodsList;
    /**
     * 秒杀商品图片数据
     */
    List<GoodsImage> goodsImageList;
    /**
     * 秒杀小时
     */
    int spikeHours;
    /**
     * 秒杀分钟
     */
    int spikeMinutes;
    /**
     * 秒杀秒钟
     */
    int spikeSeconds;
}
