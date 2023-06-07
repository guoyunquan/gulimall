package com.gyq.product.exception;


import com.gyq.common.R;
import com.gyq.common.exception.enums.ExceptionEnum;
import lombok.extern.slf4j.Slf4j;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.HashMap;

/**
 * @author GYQ
 * @date 2023/5/21 23:01
 */
@Slf4j
@RestControllerAdvice("com.gyq.product.controller")
public class ExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        HashMap<String, String> map = new HashMap<>();

        log.error("数据校验出现问题{},错误类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach((item) -> {
            String field = item.getField();
            String ErrorMessage = item.getDefaultMessage();
            map.put(field, ErrorMessage);
        });
        return R.error(ExceptionEnum.VALID_EXCEPTION.getCode(), ExceptionEnum.VALID_EXCEPTION.getMessage()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        return R.error(ExceptionEnum.SYSTEM_EXCEPTION.getCode(), ExceptionEnum.SYSTEM_EXCEPTION.getMessage());
    }
}
