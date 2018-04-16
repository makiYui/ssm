package com.test.entity;

/**
 * Created by hp on 2018/4/16.
 */
public class Result {

    private String msg;

    private Object object;

    public Result() {

    }

    public Result(String msg, Object object) {
        this.msg = msg;
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
