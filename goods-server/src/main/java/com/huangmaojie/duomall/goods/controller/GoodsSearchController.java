package com.huangmaojie.duomall.goods.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品搜索控制器
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/search")
@CrossOrigin
public class GoodsSearchController {

    @Autowired
    private CommonGoodsService commonGoodsService;

    @RequestMapping(value = "/key", method = RequestMethod.GET)
    public PageInfo<Goods> searchGoodsByKey(@RequestParam String key,@RequestParam(defaultValue = "1") int pageNum ,@RequestParam(defaultValue = "1") int pageSize) {
        if(StringUtils.isEmpty(key)){
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Goods> goods = new PageInfo<>(commonGoodsService.findGoodsByKey(key));
        return goods;
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public PageInfo<Goods> searchGoodsByType(@RequestParam String type,@RequestParam(defaultValue = "1") int pageNum ,@RequestParam(defaultValue = "1") int pageSize) {
        if(StringUtils.isEmpty(type)){
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<Goods> goods = new PageInfo<>(commonGoodsService.findGoodsByType(type));
        return goods;
    }
}
