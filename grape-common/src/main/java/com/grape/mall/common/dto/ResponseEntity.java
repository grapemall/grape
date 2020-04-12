package com.grape.mall.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseEntity<T> implements Serializable {

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

    public static <E> ResponseEntity<E> success(E content) {
        ResponseEntity<E> response = new ResponseEntity<>();
        response.setCode(200);
        response.setMessage("操作成功");
        response.setContent(content);
        return response;
    }

    public static ResponseEntity error(Integer code, String message) {
        ResponseEntity response = new ResponseEntity();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <E> ResponseEntity<E> error(Integer code, String message, E content) {
        ResponseEntity<E> response = new ResponseEntity<>();
        response.setCode(code);
        response.setMessage(message);
        response.setContent(content);
        return response;
    }
}
