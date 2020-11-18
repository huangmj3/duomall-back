package com.huangmaojie.duomall.eureka;

import org.springframework.web.bind.annotation.*;

/**
 * @author huangmaojie
 * @date 2020/6/11
 */
@CrossOrigin
@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(@RequestParam String param,ResponseBody responseBody){
//        responseBody.message
        return param;
    }
}
