package com.test.commons.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

//jackson组件，把AxiosResult对象序列化json字符串时，NULL不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult {
    private Integer returnCode;
    private String returnMsg;
    private Object returnData;

    public AxiosResult() {
    }

    public AxiosResult(E e) {
        this.returnCode = e.getReturnCode();
        this.returnMsg = e.getReturnMsg();
    }
    public AxiosResult(E e, Object data) {
        this.returnCode = e.getReturnCode();
        this.returnMsg = e.getReturnMsg();
        this.returnData = data;
    }

    public static AxiosResult suc(Object data){
        return new AxiosResult(E.SUC,data);
    }

    public static AxiosResult suc(){
        return new AxiosResult(E.SUC);
    }

    public static AxiosResult error(E e){
        return new AxiosResult(e);
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

    public Object getReturnData() {
        return returnData;
    }

    public void setReturnData(Object returnData) {
        this.returnData = returnData;
    }

    @Override
    public String toString() {
        return "AxiosResult{" +
                "returnCode=" + returnCode +
                ", returnMsg='" + returnMsg + '\'' +
                ", returnData=" + returnData +
                '}';
    }
}
