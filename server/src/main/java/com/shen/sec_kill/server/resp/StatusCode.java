package com.shen.sec_kill.server.resp;

public enum StatusCode {

    SUCCESS("A00000", "ok"),
    ERR_SYS("A00101", "系统错误"),
    ERR_WRONG_PARAMS("A00101", "不合法的参数"),
    ERR_NOT_LOGIN("P00101", "请先登录"),
    INVALID_OPERATION("P00102", "不合法的操作");

    String code;
    String msg;

    StatusCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}