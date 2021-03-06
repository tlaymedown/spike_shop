package com.tz.spike_shop.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum ResponseResultEnum {

    SUCCESS(200, "successful"),

    ERROR(404, "system error"),

    LOGIN_ERROR(40401, "用户名或密码错误"),

    MOBILE_ERROR(40402, "手机号错误"),

    EXIST_ERROR(40403, "用户已存在"),

    BIND_ERROR(40404, "数据校验异常"),

    EMPTY_STOCK(40405, "空库存或商品不存在"),

    REPEAT_SPIKE(40406, "重复秒杀"),

    USER_NOT_EXIST_ERROR(40407, "用户不存在"),

    UPDATE_ERROR(40408, "更新失败"),

    ORDER_ERROR(40409, "订单不存在"),

    USER_NOT_LOGIN(40410, "用户未登录"),

    SPIKE_PATH_ERROR(40411, "秒杀地址验证错误"),

    CAPTCHA_VALID_ERROR(40412, "验证码验证错误"),

    ACCESS_ERROR(40413, "访问过于频繁，请稍后再试"),

    REDIS_ERROR(40414, "redis error"),
    ;

    private Integer code;

    private String message;

}
