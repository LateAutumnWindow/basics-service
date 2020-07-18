package com.yan.basics.exception;

public class BasicsDaoException extends RuntimeException {

    private Integer code;

    private Object data;


    public BasicsDaoException(String message) {
        super(message);
    }

    public BasicsDaoException(Throwable cause) {
        super(cause);
    }

    public BasicsDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasicsDaoException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BasicsDaoException(Integer code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public BasicsDaoException(Integer code, String message, Object data, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
