package com.sjq.demo.response;

import lombok.Data;

@Data
public class ResponseResult<T> {

    private int code;     // 状态
    private T data;
    private String msg;    // 自定义信息

    public ResponseResult() {
        this.code = BaseRespCode.SUCCESS.getCode();
        this.msg = BaseRespCode.SUCCESS.getMsg();
        this.data = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(T data) {
        this.data = data;
        this.code = BaseRespCode.SUCCESS.getCode();
        this.msg = BaseRespCode.SUCCESS.getMsg();
    }

    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(int code, T data) {
        this.code = code;
        this.data = data;
        this.msg = null;
    }


    public ResponseResult(RespCodeInterface responseCodeInterface) {
        this.data = null;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public ResponseResult(RespCodeInterface responseCodeInterface, T data) {
        this.data = data;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public static <T> ResponseResult success() {
        return new <T>ResponseResult();
    }

    public static <T> ResponseResult success(T data) {
        return new <T>ResponseResult(data);
    }

    public static <T> ResponseResult getResult(int code, String msg, T data) {
        return new <T>ResponseResult(code, msg, data);
    }

    public static <T> ResponseResult getResult(int code, String msg) {
        return new <T>ResponseResult(code, msg);
    }

    public static <T> ResponseResult getResult(BaseRespCode responseCode) {
        return new <T>ResponseResult(responseCode);
    }

    public static <T> ResponseResult getResult(BaseRespCode responseCode, T data) {
        return new <T>ResponseResult(responseCode, data);
    }
}
