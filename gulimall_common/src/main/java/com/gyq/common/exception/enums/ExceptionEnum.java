package com.gyq.common.exception.enums;

public enum ExceptionEnum {
    SYSTEM_EXCEPTION(10000,"系统出现异常"),
    VALID_EXCEPTION(10001,"参数校验异常"),
    ;
    /**
     * 错误码
     */
    private final int code ;
    /**
     * 错误内容
     */
    private final String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
