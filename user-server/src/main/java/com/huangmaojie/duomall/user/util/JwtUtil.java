package com.huangmaojie.duomall.user.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.Date;

/**
 * jwt工具类
 */
@Data
@ConfigurationPropertiesScan("jwt.config")
public class JwtUtil {

    @Value("${jwt.config.key}")
    private String key;      //盐

    @Value("${jwt.config.expire_date}")
    private long expireDate;   //过期时间

    /**
     * 生成JWT
     *
     * @param id      token生成对象id
     * @param subject token生成对象主体
     * @param roles   token生成对象角色
     * @return token令牌
     */
    public String createJWT(String id, String subject, String roles) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        JwtBuilder builder = Jwts.builder().setId(id)
                .setSubject(subject)
                .setIssuedAt(now)
                .signWith(SignatureAlgorithm.HS256, key).claim("roles", roles);
        if (expireDate > 0) {
            builder.setExpiration(new Date(nowMillis + expireDate));
        }
        return builder.compact();
    }

    /**
     * 解析JWT
     *
     * @param jwtStr jwt字符串
     * @return 解析对象
     */
    public Claims parseJWT(String jwtStr) {
        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwtStr)
                .getBody();
    }

}
