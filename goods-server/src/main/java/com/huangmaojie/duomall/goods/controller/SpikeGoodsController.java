package com.huangmaojie.duomall.goods.controller;

import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsImage;
import com.huangmaojie.duomall.goods.entity.SpikeGoods;
import com.huangmaojie.duomall.goods.entity.SpikeGoodsResponse;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import com.huangmaojie.duomall.goods.service.SpikeGoodsService;
import com.huangmaojie.duomall.goods.util.IdWorker;
import com.netflix.client.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取秒杀商品信息
     */
    @RequestMapping(value = "/getSpikeGoodsInformation", method = RequestMethod.GET)
    public SpikeGoodsResponse getSpikeGoodsInformation(HttpServletResponse httpResponse) {
        SpikeGoodsResponse response = new SpikeGoodsResponse();
        List<Goods> goodsList = new ArrayList<>();
        List<GoodsImage> goodsImageList = new ArrayList<>();

        List<SpikeGoods> spikeGoods = spikeGoodsService.getSpikeGoods();
        for (int i = 0; i < spikeGoods.size(); i++) {
            String goodsId = spikeGoods.get(i).getGoodsId();
            Goods goods = commonGoodsService.findGoodsById(goodsId);
            goodsList.add(goods);
            GoodsImage goodsImage = commonGoodsService.findGoodsImageByGoodsId(goodsId).get(0);
            goodsImageList.add(goodsImage);
        }
        response.setGoodsList(goodsList);
        response.setGoodsImageList(goodsImageList);
        response.setSpikeHours(spikeGoods.get(0).getSpikeHours());
        response.setSpikeMinutes(spikeGoods.get(0).getSpikeMinutes());
        response.setSpikeSeconds(spikeGoods.get(0).getSpikeSeconds());
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        return response;
    }

    /**
     * 秒杀开始
     */
    @RequestMapping(value = "/spikeStart", method = RequestMethod.GET)
    public void spikeStart(@RequestParam String goodsId,@RequestParam int goodsNum) {
        //将秒杀商品添加到redis中
//        String spikeId = new IdWorker().nextId() + "";
//        Map spikeGoods = new HashMap<>();
//        spikeGoods.put("goodsId",goodsId);
//        spikeGoods.put("goodsNum",goodsNum);
        redisTemplate.opsForValue().set(goodsId,goodsNum);
    }

    /**
     * 商品商品秒杀
     */
    @RequestMapping(value = "/spikeGoods", method = RequestMethod.POST)
    public void spikeGoods(@RequestParam String goodsId) {
        //每进行一次请求，商品数量减一。当商品数量减小至零时，存入数据库
        int goodsNum = (int)redisTemplate.opsForValue().get(goodsId);
        if(goodsNum > 0){
            redisTemplate.opsForValue().set(goodsId,goodsNum-1);
        }else {
            spikeGoodsService.updateSpikeGoodsNum(goodsId,goodsNum);
        }
    }
}
