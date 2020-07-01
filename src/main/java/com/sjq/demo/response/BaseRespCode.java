package com.sjq.demo.response;

/**
 * @ClassName: BaseRespCode
 */
public enum BaseRespCode implements RespCodeInterface {

    SUCCESS(0,"操作成功"),
    SYSTEM_BUSY(40000,"系统繁忙，请稍候再试"),
    DATA_ERROR(40001,"传入数据异常") ,
    NO_USER(40002, "用户不存在"),
    ABNORMAL_USER(40003, "账号异常"),
    USER_LOCK(40004, "该用户已被锁定，请联系运营人员"),
    PASSWORD_ERROR(40005,"密码错误"),
    TOKEN_ERROR(40006, "登录凭证已过期，请重新登录"),
    UNAUTHORIZED_ERROR(40007, "权鉴校验不通过"),
    OPERATION_ERRO(40008,"操作失败"),
    TOKEN_PAST_DUE(40009, "授权信息已过期，请刷新token"),


    SEND_CODE_ERROR(30001,"发送验证码失败"),
    SEND_TOO_OFTEN(30002,"发送太频繁"),
    SEND_CODE_FAILURE(30003,"超时,验证码失效"),
    PHONE_HAS_REGISTERED(30004,"手机号码已注册"),
    VERIFYCODE_ERROR(30005,"验证码错误"),
    OLD_PASSWORD_ERROR(30006,"旧密码不正确");



    /**
     * 错误码
     */
    private final int code;
    /**
     * 错误消息
     */
    private final String msg;

    BaseRespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
