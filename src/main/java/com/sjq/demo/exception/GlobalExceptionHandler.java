package com.sjq.demo.exception;

import com.sjq.demo.response.BaseRespCode;
import com.sjq.demo.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 系统繁忙，请稍候再试"

     */
    @ExceptionHandler(Exception.class)
    public <T> ResponseResult<T> handleException(Exception e){
        logger.error("Exception,exception:{}", e);
        return ResponseResult.getResult(BaseRespCode.SYSTEM_BUSY);
    }

    /**
     * 自定义全局异常处理
     */
    @ExceptionHandler(value = GlobalException.class)
    <T> ResponseResult<T> globalExceptionHandler(GlobalException e) {
        logger.error("Exception,exception:{}", e);
        return new ResponseResult<>(e.getMessageCode(),e.getDetailMessage());
    }

}
