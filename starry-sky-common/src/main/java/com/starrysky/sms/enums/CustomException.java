package com.starrysky.sms.enums;

import lombok.Data;
/**
 * @ClassName: CustomException 
 * @Author: wmz
 * @Description:自定义异常，继承RuntimeException ，可根据业务需要添加，此处不做更多扩展
 */
@Data
public class CustomException extends RuntimeException {
    private int code;
    private String message;
}
