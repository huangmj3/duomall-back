package com.huangmaojie.duomall.goods.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.*;
import com.huangmaojie.duomall.goods.service.CommonGoodsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

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
    public CommonGoodsResponse searchGoodsByKey(@RequestParam String key, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<Goods> goodsByKey = commonGoodsService.findGoodsByKey(key);
        if (CollectionUtils.isEmpty(goodsByKey)) {
            return null;
        }
        PageInfo<Goods> goodsList = new PageInfo<>(goodsByKey);
        CommonGoodsResponse response = commonGoodsService.findAllInfo(goodsList);
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return response;
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public CommonGoodsResponse searchGoodsByType(@RequestParam String type, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize, HttpServletResponse httpServletResponse) {
        if (StringUtils.isEmpty(type)) {
            return null;
        }
        PageHelper.startPage(pageNum, pageSize);
        Page<Goods> goodsByType = commonGoodsService.findGoodsByType(type);
        if (CollectionUtils.isEmpty(goodsByType)) {
            return null;
        }
        PageInfo<Goods> goodsList = new PageInfo<>(goodsByType);
        CommonGoodsResponse response = commonGoodsService.findAllInfo(goodsList);
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        return response;
    }
}
