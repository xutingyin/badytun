package com.itlaoqi.babytun.result;

import com.itlaoqi.babytun.constant.ReturnCode;
import lombok.Data;

@Data
public class JsonResult<T> {
    private String code;
    private String msg;
    private T data;

}
