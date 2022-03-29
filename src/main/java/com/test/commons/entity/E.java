package com.test.commons.entity;

public enum E {
    SUC(200,"suc"),
    ERROR(500,"error"),

    VALIDATE_ERROR(50001,"验证码错误"),
    UNAME_ERROR(50002,"用户名不存在"),
    BY_ZERO(50003,"除数为0"),
    NO_LOGIN(50004,"用户未登录"),
    DATA_RELATED(50005,"数据被关联" ),
    PHONE_ERROR(50006,"手机号不存在" );
    private Integer returnCode;
    private String returnMsg;

    E(Integer code, String msg) {
        this.returnCode = code;
        this.returnMsg = msg;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
