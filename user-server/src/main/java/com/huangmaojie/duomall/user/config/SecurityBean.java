package com.huangmaojie.duomall.user.config;

import com.huangmaojie.duomall.user.util.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 安全用Bean
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Configuration
public class SecurityBean {

    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }
}
