package com.ssm.demo.entity;

/**
 * @author Vincent Vincent
 * @version v1.0
 * @name SsmDemo
 * @page com.ssm.demo.entity
 * @class describe
 * @date 2019/1/16 11:02
 */
public class ResponseBean {

    private int code;
    private String msg;
    private Object data;
    //true 成功标志(表示为达到想要的结果，并不是网络请求成功)  false  失败(请求失败，登录失败等)
    private boolean success;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
