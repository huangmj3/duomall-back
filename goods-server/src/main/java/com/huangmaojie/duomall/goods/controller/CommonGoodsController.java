package com.huangmaojie.duomall.goods.controller;

import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsImage;
import com.huangmaojie.duomall.goods.entity.GoodsParam;
import com.huangmaojie.duomall.goods.entity.GoodsSetMeal;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 通用商品控制器
 *
 * @author huangmaojie
 * @date 2020/5/3
 */
@RestController
@RequestMapping("/commonGoods")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class CommonGoodsController {

    @Autowired
    private CommonGoodsService commonGoodsService;

    /**
     * 根据goodsId进行商品概要信息查询
     */
    @RequestMapping(value = "/getGoods", method = RequestMethod.GET)
    public Goods getGoodsById(@RequestParam(value = "goodsId") String goodsId) {
        return commonGoodsService.getGoodsById(goodsId);
    }

    /**
     * 根据goodsId进行商品图片信息查询
     */
    @RequestMapping(value = "/getGoodsImage", method = RequestMethod.GET)
    public GoodsImage getGoodsImageByGoodsId(@RequestParam(value = "goodsId") String goodsId) {
        return commonGoodsService.getGoodsImageByGoodsId(goodsId);
    }

    /**
     * 根据goodsId进行商品参数信息查询
     */
    @RequestMapping(value = "/getGoodsParam", method = RequestMethod.GET)
    public GoodsParam getGoodsParamByGoodsId(@RequestParam(value = "goodsId") String goodsId) {
        return commonGoodsService.getGoodsParamByGoodsId(goodsId);
    }

    /**
     * 根据goodsId进行商品套餐信息查询
     */
    @RequestMapping(value = "/getGoodsSetMeal", method = RequestMethod.GET)
    public GoodsSetMeal getGoodsSetMealByGoodsId(@RequestParam(value = "goodsId") String goodsId) {
        return commonGoodsService.getGoodsSetMealByGoodsId(goodsId);
    }
}
