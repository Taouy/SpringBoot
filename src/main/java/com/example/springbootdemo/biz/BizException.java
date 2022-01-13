package com.example.springbootdemo.biz;

/**
 * @author Taouy
 * @Description
 * @date 2021/11/23 11:27
 */
public class BizException extends  Exception{

    //异常携带的错误信息
    private  Object data;

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Object data) {
        super(message);
        this.data = data;
    }

    public BizException(String message, Throwable cause, Object data) {
        super(message, cause);
        this.data = data;
    }


}
