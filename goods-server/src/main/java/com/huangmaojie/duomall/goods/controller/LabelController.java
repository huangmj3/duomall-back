package com.huangmaojie.duomall.goods.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/label")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class LabelController {

    @RequestMapping(method = RequestMethod.GET)
    public String findAll(){
        return "lo";
    }
}
