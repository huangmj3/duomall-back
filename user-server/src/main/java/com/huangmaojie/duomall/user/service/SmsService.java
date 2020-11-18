package com.huangmaojie.duomall.user.service;

/**
 * 阿里云短信发送服务
 *
 * @author huangmaojie
 * @date 2020/5/20
 */
public interface SmsService {

    /**
     * 发送短信
     *
     * @param cellphone 要发送的手机号
     * @param code 验证码
     */
    void sendSms(String cellphone, String code);
}
