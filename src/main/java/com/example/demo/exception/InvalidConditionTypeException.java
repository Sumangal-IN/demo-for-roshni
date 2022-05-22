package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvalidConditionTypeException extends RuntimeException {
    private String msg;
}
