package com.atxiaoming.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端出错"),

    ACCPWD_NOT_EMPTY(50001,"账号或密码不能为空"),
    ACC_ERROR(50002,"账号错误"),
    PWD_ERROR(50003,"密码错误"),
    NAME_NOT_EMPTY(50004,"用户名不能为空"),
    ACC_NOT_EMPTY(50005,"账号不能为空"),
    PWD_NOT_EMPTY(50006,"密码不能为空"),
    NOT_LOGIN(50007,"未检测到登录信息"),
    ;

    private final Integer code;
    private final String msg;
}
