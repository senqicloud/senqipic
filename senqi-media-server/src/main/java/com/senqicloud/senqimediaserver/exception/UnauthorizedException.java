package com.senqicloud.senqimediaserver.exception;


import com.senqicloud.senqimediaserver.response.ResultCode;

/**
 * 未认证异常
 * @author CoderMast
 */

public class UnauthorizedException extends BizException {
    public UnauthorizedException() {
        super(ResultCode.UNAUTHORIZED);
    }

    public UnauthorizedException(String message) {
        super(ResultCode.UNAUTHORIZED.getCode(), message);
    }
}