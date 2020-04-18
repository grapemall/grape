package com.grape.mall.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseBody<T> implements Serializable {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应内容
     */
    private T content;

    public static <E> ResponseBody<E> success(E content) {
        ResponseBody<E> response = new ResponseBody<>();
        response.setCode(200);
        response.setMessage("操作成功");
        response.setContent(content);
        return response;
    }

    public static ResponseBody error(Integer code, String message) {
        ResponseBody response = new ResponseBody();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <E> ResponseBody<E> error(Integer code, String message, E content) {
        ResponseBody<E> response = new ResponseBody<>();
        response.setCode(code);
        response.setMessage(message);
        response.setContent(content);
        return response;
    }
}
