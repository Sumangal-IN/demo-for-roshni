package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConditionTypeController {

    @Autowired
    ConditionTypeValidator validator;

    @GetMapping("/validate/{conditionType}")
    public ResponseEntity<String> validate(@PathVariable String conditionType) {
        validator.validate(conditionType);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/txt");

        return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body("Condition type " + conditionType + " is valid");
    }
}
