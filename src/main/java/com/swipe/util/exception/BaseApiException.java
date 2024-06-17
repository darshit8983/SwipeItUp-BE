package com.swipe.util.exception;

public class BaseApiException extends RuntimeException{

    String msg;
    Throwable clause;

    public BaseApiException() {
        super();
    }

    public BaseApiException(String msg, Throwable clause) {
        super(msg,clause);
    }
}