package com.huangmaojie.duomall.cart.client;

import com.huangmaojie.duomall.cart.entity.Goods;
import com.huangmaojie.duomall.cart.entity.GoodsImage;
import com.huangmaojie.duomall.cart.entity.GoodsParam;
import com.huangmaojie.duomall.cart.entity.GoodsSetMeal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * goods微服务feign调用客户端
 *
 * @author huangmaojie
 * @date 2020/5/11
 */
@FeignClient(value = "duomall-goods-server")
public interface GoodsClient {

    /**
     * 节点可用性测试
     */
    @RequestMapping(value = "/healthy", method = RequestMethod.GET)
    String healthyTest();

    /**
     * commonGoods类方法测试用
     */
//    @RequestMapping(method = RequestMethod.GET, path = "commonGoods/test")
    @RequestMapping(value = "commonGoods/test",method = RequestMethod.GET)
    String commonGoodsTest(@RequestParam("param") String param);

    /**
     * 根据goodsId进行商品概要信息查询
     */
    @RequestMapping(value = "/commonGoods/getGoods", method = RequestMethod.GET)
    Goods getGoodsById(@RequestParam("goodsId") String goodsId);

    /**
     * 根据goodsId进行商品图片信息查询
     */
    @RequestMapping(value = "/commonGoods/getGoodsImage", method = RequestMethod.GET)
    GoodsImage getGoodsImageByGoodsId(@RequestParam("goodsId") String goodsId);

    /**
     * 根据goodsId进行商品参数信息查询
     */
    @RequestMapping(value = "/commonGoods/getGoodsParam", method = RequestMethod.GET)
    GoodsParam getGoodsParamByGoodsId(@RequestParam("goodsId") String goodsId);

    /**
     * 根据goodsId进行商品套餐信息查询
     */
    @RequestMapping(value = "/commonGoods/getGoodsSetMeal", method = RequestMethod.GET)
    GoodsSetMeal getGoodsSetMealByGoodsId(@RequestParam("goodsId") String goodsId);
}
