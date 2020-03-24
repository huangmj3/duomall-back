package com.huangmaojie.duomall.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huangmaojie
 * @date 2020/3/24
 */
@FeignClient(value = "duomall-commodity-server")
public interface LabelClient {
    @RequestMapping(value = "/label",method = RequestMethod.GET)
    public String findAll();
}
