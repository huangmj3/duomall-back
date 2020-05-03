package com.huangmaojie.duomall.goods.controller;

import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsImage;
import com.huangmaojie.duomall.goods.entity.SpikeGoods;
import com.huangmaojie.duomall.goods.entity.SpikeGoodsResponse;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import com.huangmaojie.duomall.goods.service.SpikeGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 秒杀商品控制器
 *
 * @author huangmaojie
 * @date 2020/5/2
 */
@RestController
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class SpikeGoodsController {

    @Autowired
    private SpikeGoodsService spikeGoodsService;

    @Autowired
    private CommonGoodsService commonGoodsService;

    /**
     * 获取秒杀商品信息
     */
    @RequestMapping(value = "/getSpikeGoodsInformation",method = RequestMethod.GET)
    public SpikeGoodsResponse getSpikeGoodsInformation(){
        SpikeGoodsResponse response = new SpikeGoodsResponse();
        List<Goods> goodsList = new ArrayList<>();
        List<GoodsImage> goodsImageList = new ArrayList<>();

        List<SpikeGoods> spikeGoods = spikeGoodsService.getSpikeGoods();
        for (int i = 0; i < spikeGoods.size(); i++) {
            String goodsId = spikeGoods.get(i).getGoodsId();
            Goods goods = commonGoodsService.findGoodsById(goodsId);
            goodsList.add(goods);
            GoodsImage goodsImage = commonGoodsService.findGoodsImageByGoodsId(goodsId);
            goodsImageList.add(goodsImage);
        }
        response.setGoodsList(goodsList);
        response.setGoodsImageList(goodsImageList);
        response.setSpikeHours(spikeGoods.get(0).getSpikeHours());
        response.setSpikeMinutes(spikeGoods.get(0).getSpikeMinutes());
        response.setSpikeSeconds(spikeGoods.get(0).getSpikeSeconds());
        return response;
    }
}
