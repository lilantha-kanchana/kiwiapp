package com.kiwi.customExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by malithi on 12/27/16.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such record found")  // 404
public class RecordNotFoundException  extends RuntimeException {
}
