package com.swipe.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BaseApiException extends ResponseStatusException {


    public BaseApiException(HttpStatus status, String msg) {
        super(status, msg);
    }

    public BaseApiException(HttpStatus httpStatus, String msg, Throwable clause) {
        super(httpStatus,msg,clause);
    }
}