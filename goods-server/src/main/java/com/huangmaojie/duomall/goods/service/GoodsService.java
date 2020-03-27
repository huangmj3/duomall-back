package com.huangmaojie.duomall.goods.service;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.Goods;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * 商品服务接口
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Validated
public interface GoodsService {

    /**
     * 根绝关键词寻找商品
     * @param key 关键词
     * @return 寻找结果
     */
    public Page<Goods> findGoodsByKey(@NotEmpty String key);

    Page<Goods> findGoodsByType(String type);
}
