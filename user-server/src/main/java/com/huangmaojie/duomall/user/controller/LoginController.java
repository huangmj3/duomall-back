package com.huangmaojie.duomall.user.controller;

import com.huangmaojie.duomall.user.entity.Constraints;
import com.huangmaojie.duomall.user.entity.Result;
import com.huangmaojie.duomall.user.entity.StatusCode;
import com.huangmaojie.duomall.user.entity.User;
import com.huangmaojie.duomall.user.service.UserService;
import com.huangmaojie.duomall.user.util.JwtUtil;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(method = RequestMethod.POST)
    public Result loginByCellphone(HttpServletRequest request, @RequestBody User user) {
        //返回结果
        Map<String, Object> date = new HashMap();
        Map<String, Object> validationResults = userService.loginVerification(user.getCellphone(), user.getLoginPassword());
        if (MapUtils.getBoolean(validationResults, Constraints.MATCHED)) {
            String userId = MapUtils.getString(validationResults, Constraints.USER_ID);
            //生成token给客户端，并临时存储到Redis中
            String token = jwtUtil.createJWT(userId, user.getCellphone(), "normalUser");
            date.put(Constraints.MATCHED,true);
            date.put(Constraints.TOKEN,token);
            //存入redis中并设置过期时间
            redisTemplate.opsForValue().set(Constraints.TOKEN,token,10, TimeUnit.HOURS);
            return new Result(true, StatusCode.OK, "账号密码正确", date);
        }else {
            date.put(Constraints.MATCHED,false);
            return new Result(true, StatusCode.OK, "用户名错误或手机号不存在", date);
        }
    }
}
