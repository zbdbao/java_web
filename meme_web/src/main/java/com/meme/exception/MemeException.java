package com.meme.exception;

import com.meme.constants.ExceptionStatus;

/**
 * Created by zhangb on 9/12/2015.
 */
public class MemeException extends Exception{

    protected ExceptionStatus exceptionStatus;

    public MemeException(){
        this.exceptionStatus = ExceptionStatus.GENERIC_ERRORM;
    }

    public MemeException(String errorMessage){
        super(errorMessage);
        this.exceptionStatus = ExceptionStatus.GENERIC_ERRORM;
    }

    public MemeException(ExceptionStatus exceptionStatus){
        this.exceptionStatus = exceptionStatus;
    }

    public MemeException(String errorMessage, ExceptionStatus exceptionStatus){
        super(errorMessage);
        this.exceptionStatus = exceptionStatus;
    }

    public ExceptionStatus getExceptionStatus() {
        return exceptionStatus;
    }

    public void setExceptionStatus(ExceptionStatus exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
    }

    @Override
    public String toString() {
        return "MemeException{" +
                "exceptionStatus=" + exceptionStatus +
                '}'+super.toString();
    }
}
