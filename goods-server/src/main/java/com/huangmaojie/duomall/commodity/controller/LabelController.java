package com.huangmaojie.duomall.commodity.controller;

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
@CrossOrigin
public class LabelController {

    @RequestMapping(method = RequestMethod.GET)
    public String findAll(){
        return "lo";
    }
}
