package com.huangmaojie.duomall.goods.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  秒杀商品服务控制器
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@RestController
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
@RequestMapping("/spike")
public class SpikeController {

}
