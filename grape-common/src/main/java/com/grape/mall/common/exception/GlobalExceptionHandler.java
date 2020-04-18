package com.grape.mall.common.exception;

import com.grape.mall.common.dto.ResponseBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理系统错误
     * @param e
     * @return
     */
    @ExceptionHandler(Throwable.class)
    public ResponseBody handleThrowable(Throwable e){
        log.error("系统错误", e);
        return ResponseBody.error(INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }

    /**
     * 处理系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseBody handleException(Exception e){
        log.error("系统异常", e);
        return ResponseBody.error(INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }

    /**
     * 处理业务异常
     * @param e
     * @return
     */
	@ExceptionHandler(value = BizException.class)
	public ResponseBody handleBizException(BizException e) {
        log.error("业务异常", e);
        return ResponseBody.error(e.getStatus(), e.getMessage());
	}


    /**
     * 处理接口参数数据验证异常
     * @param vex
     * @param bex
     * @return
     */
    @ExceptionHandler({BindException.class, MethodArgumentNotValidException.class})
    public ResponseBody handleArgsNotValidException(MethodArgumentNotValidException vex, BindException bex){
        log.error("参数校验异常", vex == null ? bex: vex);
        String message = "";
        FieldError fieldError = null;
        if (vex != null) {
            fieldError = vex.getBindingResult().getFieldError();
            message =  fieldError.getDefaultMessage();
        } else {
            fieldError = bex.getBindingResult().getFieldError();
            message = fieldError.getDefaultMessage();
        }
        return ResponseBody.error(BAD_REQUEST.value(), String.format("%s:%s", fieldError.getField(), message));
    }
}
