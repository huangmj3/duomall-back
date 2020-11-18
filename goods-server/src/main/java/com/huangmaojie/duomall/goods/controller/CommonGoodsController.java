package com.huangmaojie.duomall.goods.controller;

import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsImage;
import com.huangmaojie.duomall.goods.entity.GoodsParam;
import com.huangmaojie.duomall.goods.entity.GoodsSetMeal;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
     * commonGoods类方法可用性测试用
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String commonGoodsTest(@RequestParam(value = "param") String param) {
        return "commonGoods测试成功" + ",接收到的param是:" + param;
    }

    /**
     * 根据goodsId进行商品概要信息查询
     */
    @RequestMapping(value = "/getGoods", method = RequestMethod.GET)
    public Goods getGoodsById(@RequestParam(value = "goodsId") String goodsId, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(goodsId)) {
            return null;
        }
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return commonGoodsService.findGoodsById(goodsId);
    }

    /**
     * 根据goodsId进行商品图片信息查询
     */
    @RequestMapping(value = "/getGoodsImage", method = RequestMethod.GET)
    public List<GoodsImage> getGoodsImageByGoodsId(@RequestParam(value = "goodsId") String goodsId, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(goodsId)) {
            return null;
        }
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return commonGoodsService.findGoodsImageByGoodsId(goodsId);
    }

    /**
     * 根据goodsId进行商品参数信息查询
     */
    @RequestMapping(value = "/getGoodsParam", method = RequestMethod.GET)
    public List<GoodsParam> getGoodsParamByGoodsId(@RequestParam(value = "goodsId") String goodsId, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(goodsId)) {
            return null;
        }
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return commonGoodsService.findGoodsParamByGoodsId(goodsId);

    }

    /**
     * 根据goodsId进行商品套餐信息查询
     */
    @RequestMapping(value = "/getGoodsSetMeal", method = RequestMethod.GET)
    public List<GoodsSetMeal> getGoodsSetMealByGoodsId(@RequestParam(value = "goodsId") String goodsId, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(goodsId)) {
            return null;
        }
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return commonGoodsService.findGoodsSetMealByGoodsId(goodsId);
    }
}
