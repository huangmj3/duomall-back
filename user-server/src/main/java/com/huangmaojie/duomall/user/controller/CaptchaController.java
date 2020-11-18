package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.mapper.AddressMapper;
import com.huangmaojie.duomall.user.service.SmsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证码控制器
 *
 * @author huangmaojie
 * @date 2020/5/20
 */
@RestController
@RequestMapping("/captcha")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class CaptchaController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 发送短信验证码，并将验证码存入消息队列
     */
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public Result sendCaptcha(@RequestParam String userId, @RequestParam String cellphone) {
        userId = "1262764905694003200";
        String code = "106325";
        //发送短信验证码
        smsService.sendSms(cellphone,code);
        //将验证码存入redis
        Map captcha = new HashMap<>();
        captcha.put("userId", userId);
        captcha.put("code", code);
        rabbitTemplate.convertAndSend("captcha", captcha);
        return new Result(true, StatusCode.OK, "验证码发送成功",captcha);
    }

    /**
     * 从redis缓存中取出短信验证码，和用户所填写的验证码进行比对，进行验证码验证
     */
    @RabbitHandler
    @RequestMapping(value = "/verification", method = RequestMethod.GET)
    public Result verifyCaptcha(@RequestParam String userId, @RequestParam String captcha) {
        String code = (String) redisTemplate.opsForValue().get(userId);
        if (StringUtils.isEmpty(code)) {
            return new Result(false, StatusCode.NO_CAPTCHA_EXIST, "验证码未发送，或验证码过期");
        }
        if (!code.equals(captcha)) {
            return new Result(false, StatusCode.CAPTCHA_ERROR, "验证码错误");

        }
        return new Result(true, StatusCode.OK, "验证成功");
    }
}
