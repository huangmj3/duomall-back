package com.huangmaojie.duomall.goods.entity;

import lombok.Data;

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
    Goods goods;
    /**
     * 秒杀商品图片数据
     */
    GoodsImage goodsImage;
    /**
     * 秒杀时间数据
     */
}
