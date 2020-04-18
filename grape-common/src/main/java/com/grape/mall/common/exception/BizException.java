package com.grape.mall.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

/**
 * 统一异常处理
 */
@Getter
public class BizException extends RuntimeException {

    private Integer status = BAD_REQUEST.value();

    public BizException(String msg){
        super(msg);
    }

    public BizException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
}
