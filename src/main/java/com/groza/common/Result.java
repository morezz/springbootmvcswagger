package com.groza.common;

/**
 * Result
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

public class Result {
    int code;
    String msg;
    Object var;

    public Result(int code, String msg, Object var) {
        this.code = code;
        this.msg = msg;
        this.var = var;
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

    public Object getVar() {
        return var;
    }

    public void setVar(Object var) {
        this.var = var;
    }
}
