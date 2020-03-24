package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.client.LabelClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LabelClient labelClient;

    @RequestMapping(method = RequestMethod.GET)
    public String findAll(){
        String a = labelClient.findAll();
        System.out.println(1);
        return "a";
    }
}
