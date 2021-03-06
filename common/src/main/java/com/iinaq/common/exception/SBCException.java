package com.iinaq.common.exception;


import com.iinaq.common.enums.StatusEnum;

import java.io.Serializable;

/**
 * Function:通用异常
 *
 * @since JDK 1.8
 */
public class SBCException extends RuntimeException implements Serializable{
    private static final long serialVersionUID = -8806370060612489108L;

    private String errCode ;
    private String errMsg;


    public SBCException(String errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public SBCException(String errMsg) {
        super(errMsg);
        this.errCode = StatusEnum.FAIL.getCode();
        this.errMsg = errMsg;
    }

    public SBCException(StatusEnum statusEnum) {
        super(statusEnum.getMessage());
        this.errCode = statusEnum.getCode();
        this.errMsg = statusEnum.getMessage();
    }
    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
