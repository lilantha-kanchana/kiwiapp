package com.kiwi.customExceptions;

import org.codehaus.groovy.runtime.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by malithi on 12/27/16.
 */
@ControllerAdvice
public class GlobalExceptionHandlerController {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<ErrorInfo> noRequestHandlerFoundExceptionHandler(NoHandlerFoundException e) {
        //log.debug("noRequestHandlerFound: stacktrace={}",ExceptionUtils.getStackTrace(e));

        String errorCode = "400 - Bad Request";
        String errorMsg = "Requested URL doesn't exist";

        return new ResponseEntity<>(new ErrorInfo(errorCode, e), HttpStatus.BAD_REQUEST);
    }
}
