/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author huongpham
 */
public class MajorCodeConstraintValidator implements ConstraintValidator<MajorCode,String>{
    private String majorAbbre;
    @Override
    public void initialize(MajorCode constraintAnnotation) {
        this.majorAbbre = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String userInput, ConstraintValidatorContext cvc) {
        
        boolean result;
                
        if (userInput!=null)
            result = userInput.startsWith(majorAbbre);
        else
            result = false;
        return result;
    }

    
    
}
