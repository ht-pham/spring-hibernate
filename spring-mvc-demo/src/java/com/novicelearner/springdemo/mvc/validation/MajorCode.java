/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/AnnotationType.java to edit this template
 */
package com.novicelearner.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author huongpham
 */
@Constraint(validatedBy = MajorCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MajorCode {
    // Define default value & error message
    public String value() default "CSC";
    public String message() default "Must be a CS-majored student to register these CS courses";
    
    // Define default groups & payloads
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
