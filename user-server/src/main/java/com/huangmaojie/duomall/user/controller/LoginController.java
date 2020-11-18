package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Constraints;
import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.service.UserService;
import com.huangmaojie.duomall.user.util.JwtUtil;
import org.apache.commons.collections4.MapUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 登录控制器
 *
 * @author huangmaojie
 * @date 2020/3/24
 */
@RestController
@RequestMapping("/login")
@CrossOrigin(allowCredentials = "true", maxAge = 3600)
public class  LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public Result loginByCellphone(@RequestParam String cellphone, @RequestParam String loginPassword) {
        //返回结果
        Map<String, Object> date = new HashMap();
        Map<String, Object> validationResults = userService.loginVerification(cellphone, loginPassword);
        if (MapUtils.getBoolean(validationResults, Constraints.MATCHED)) {
            String userId = MapUtils.getString(validationResults, Constraints.USER_ID);
            String name = MapUtils.getString(validationResults, Constraints.NAME);
            //生成token给客户端，并临时存储到Redis中
            String token = jwtUtil.createJWT(userId, cellphone, "normalUser");
            date.put(Constraints.USER_ID, userId);
            date.put(Constraints.NAME, name);
            date.put(Constraints.TOKEN, token);
            //存入redis中并设置过期时间
            redisTemplate.opsForValue().set(Constraints.TOKEN, token, 10, TimeUnit.HOURS);
            return new Result(true, StatusCode.OK, "账号密码正确", date);
        } else {
            date.put(Constraints.MATCHED, false);
            return new Result(true, StatusCode.OK, "用户名错误或手机号不存在", date);
        }
    }
}
