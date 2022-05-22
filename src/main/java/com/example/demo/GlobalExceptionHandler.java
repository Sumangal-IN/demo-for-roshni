package com.example.demo;

import com.example.demo.exception.InvalidConditionTypeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidConditionTypeException.class)
    public ResponseEntity<String> handleInvalidConditionTypeException(InvalidConditionTypeException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMsg());
    }
}
