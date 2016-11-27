package com.hqw.voteme.controller.common;

/**
 * AJax异步请求处理结果类
 *
 * @author Oopsguy
 *
 */
public class AjaxResult<T> {

    private String status;
    private String msg;
    private T data;

    public AjaxResult() {

    }

    public AjaxResult(String status) {
        this.status = status;
    }

    public AjaxResult(String status, T data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    public AjaxResult(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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