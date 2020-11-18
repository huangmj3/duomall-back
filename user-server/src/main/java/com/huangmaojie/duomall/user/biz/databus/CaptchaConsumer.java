package com.huangmaojie.duomall.user.biz.databus;

import org.apache.commons.collections4.MapUtils;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 短信验证码消费者
 *
 * @author huangmaojie
 * @date 2020/5/20
 */
@Component
@RabbitListener(queues = "captcha")
public class CaptchaConsumer {

    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 短信验证码消费者，将消息队列中的userId和验证码信息进行消费，存入redis并设置过期时间
     */
    @RabbitHandler
    public void saveCaptcha(Map captcha){
        System.out.println("获得一次消费");
        redisTemplate.opsForValue().set(MapUtils.getString(captcha,"userId"),MapUtils.getString(captcha,"code"),10, TimeUnit.MINUTES);
    }
}
