package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ConditionTypeResponse {
    private String error;
    private int count;
    private List<ConditionTypeName> value;
}
