package com.mosesc.vobscriptapi.exception;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
public class ValidateFailedException extends RuntimeException {
    public ValidateFailedException(){}
    public ValidateFailedException(String message){
        super(message);
    }
}
