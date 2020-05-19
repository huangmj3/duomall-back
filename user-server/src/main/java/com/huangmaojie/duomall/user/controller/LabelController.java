package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.client.LabelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 测试用接口
 *
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/label")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class LabelController {

    @Autowired
    private LabelClient labelClient;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String findAll(@RequestParam(value = "param", defaultValue = "11") String param) {
        System.out.println("进行 user 对 goods feign调用");
        String a = labelClient.findAll();
        System.out.println(1);
        return a;
    }
}
