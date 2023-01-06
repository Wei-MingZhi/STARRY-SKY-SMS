package com.starrysky.sms.enums;

/**
 * @author wmz
 * 返回成功失败枚举类
 */

public enum ResponseEunm {

    /**
     * 成功
     */
    SUCCESS(20000, "成功"),
    /**
     * 失败
     */
    FAIL(10000, "失败");

    private final Integer code;

    private final String message;

    ResponseEunm(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
