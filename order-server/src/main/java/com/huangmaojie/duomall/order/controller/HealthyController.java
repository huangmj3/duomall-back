package com.huangmaojie.duomall.order.controller;

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
    /**
     * 节点可用性测试
     */
    @RequestMapping(method = RequestMethod.GET)
    public String healthyTest(){
        return "order微服务健康";
    }
}
