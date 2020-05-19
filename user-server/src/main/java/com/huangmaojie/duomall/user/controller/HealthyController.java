package com.huangmaojie.duomall.user.controller;

import org.springframework.web.bind.annotation.*;

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
    public String healthyTest() {
        return "user微服务健康";
    }
}
