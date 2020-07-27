package com.itlaoqi.babytun.constant;

/**
 * 全局返回状态编码
 */
public enum ReturnCode {
    SUCCESS("20000","成功"),
    FAIL("99999","失败");
    private String code;
    private  String msg;

    ReturnCode(String code, String msg) {
        this.code =code;
        this.msg = msg;
    }

    public static  ReturnCode getReturnCode(String code){
        for(ReturnCode returnCode :ReturnCode.values()){
            if(returnCode.equals(code)){
                return returnCode;
            }
        }
        return null;
    }
}
