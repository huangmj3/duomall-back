package com.huangmaojie.duomall.user.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 心跳监听
 *
 * @author huangmaojie
 * @date 2020/4/22
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class HeartController {
    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        return ""
    }
}
