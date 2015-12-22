package com.meme.exception;

import com.meme.constants.ExceptionStatus;

/**
 * Created by zhangb on 9/12/2015.
 */
public class UserAuthException extends MemeException {
    public UserAuthException() {
        super();
    }

    public UserAuthException(String errorMessage) {
        super(errorMessage);
    }

    public UserAuthException(ExceptionStatus exceptionStatus) {
        super(exceptionStatus);
    }

    public UserAuthException(String errorMessage, ExceptionStatus exceptionStatus) {
        super(errorMessage, exceptionStatus);
    }
}
