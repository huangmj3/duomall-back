package com.huangmaojie.duomall.cart.controller;

import com.huangmaojie.duomall.cart.client.GoodsClient;
import com.huangmaojie.duomall.cart.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康监听
 *
 * @author huangmaojie
 * @date 2020/4/22
 */
@RestController
@RequestMapping("/healthy")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class HealthyController {

    @Autowired
    private GoodsClient goodsClient;

    /**
     * 节点可用性测试
     */
    @RequestMapping(method = RequestMethod.GET)
    public String healthyTest() {
        return "cart微服务健康";
    }

    /**
     * 向goods微服务的feign调用可用性测试
     */
    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String feignHealthyTest() {
        return "来自goods微服务调用:" + goodsClient.healthyTest();
    }

    /**
     * goods微服务commonGoods类方法可用性测试
     */
    @RequestMapping(value = "/commonGoodsTest", method = RequestMethod.GET)
    public String commonGoodsTest() {
        return "来自goods微服务调用：" + goodsClient.commonGoodsTest("test成功");
    }

    /**
     * goods微服务commonGoods类getGoodsById方法可用性测试
     */
    @RequestMapping(value = "/getGoodsTest", method = RequestMethod.GET)
    public Goods getGoodsTest() {
        return goodsClient.getGoodsById("1");
    }
}
