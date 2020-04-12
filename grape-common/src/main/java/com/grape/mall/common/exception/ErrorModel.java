package com.grape.mall.common.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorModel {

    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp;
    private String message;

    private ErrorModel() {
        timestamp = LocalDateTime.now();
    }

    public ErrorModel(Integer status, String message) {
        this();
        this.status = status;
        this.message = message;
    }
}


