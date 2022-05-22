package com.example.demo;

import com.example.demo.exception.InvalidConditionTypeException;
import com.example.demo.model.ConditionTypeName;
import com.example.demo.model.ConditionTypeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConditionTypeValidator {

    public void validate(String conditionType) {
        RestTemplate restTemplate = new RestTemplate();

        ConditionTypeResponse conditionTypeResponse =
                restTemplate.getForObject("http://localhost:7070/v1/condition_type", ConditionTypeResponse.class);

        List<ConditionTypeName> conditionTypeNameList = conditionTypeResponse.getValue();

//        for(ConditionTypeName cn: conditionTypeNameList){
//            if(cn.getConditionType().equals(conditionType))
//                return true;
//        }
//        return false;

        if (conditionTypeResponse.getValue().stream().noneMatch(conditionTypeName -> conditionTypeName.getConditionType().equals(conditionType)))
            throw new InvalidConditionTypeException("Condition Type " + conditionType + " is invalid");
    }
}
