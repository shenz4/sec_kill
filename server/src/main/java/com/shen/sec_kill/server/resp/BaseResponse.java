package com.shen.sec_kill.server.resp;

public class BaseResponse<T> {
    private String code;
    private String msg;
    private T data;

    // For Success
    public BaseResponse(T data) {
        this.code = StatusCode.SUCCESS.code;
        this.msg = "ok";
        this.data = data;
    }

    // For Error
    public BaseResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // All Functions
    public BaseResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
