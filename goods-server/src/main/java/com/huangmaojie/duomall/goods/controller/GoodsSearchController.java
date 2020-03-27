package com.huangmaojie.duomall.goods.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.SearchPageInformation;
import com.huangmaojie.duomall.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品搜索查找器
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/search")
@CrossOrigin
public class GoodsSearchController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    public PageInfo<Goods> searchGoodsByKey(@RequestBody SearchPageInformation pageInformation){
        PageHelper.startPage(pageInformation.getPageNum(),pageInformation.getPageSize());
        PageInfo<Goods> goods = new PageInfo<>(goodsService.findGoodsByKey(pageInformation.getKey()));
        return goods;
    }
}
