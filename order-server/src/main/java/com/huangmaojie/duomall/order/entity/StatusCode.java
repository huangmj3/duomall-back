package com.huangmaojie.duomall.order.entity;

public class StatusCode {
    public static final int OK = 20000;//成功
    public static final int ERROR = 20001;//失败
    public static final int LOGIN_ERROR = 20002;//用户名或密码错误
    public static final int ACCESS_ERROR = 20003;//权限不足
    public static final int REMOTE_ERROR = 20004;//远程调用失败
    public static final int REPEAT_ERROR = 20005;//重复操作
    public static final int CELLPHONE_EXITS = 20006;
}