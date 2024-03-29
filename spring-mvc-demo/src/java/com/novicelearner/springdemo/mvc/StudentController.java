/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
/**
 *
 * @author huongpham
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
    
    @RequestMapping("/registrationForm")
    public String showForm(Model theModel){
        //Biding a new Student object to the Model attribute
        theModel.addAttribute("student",new Student());
        theModel.addAttribute("theCountryOptions", countryOptions); 
        return "student-form";
    }
    
    @RequestMapping("/confirmationForm")
    public String confirmationForm(@ModelAttribute("student") Student theStudent){
        //Just a log message for a successful data binding
        System.out.println(theStudent.getLastName()+" is registered");
        return "student-confirmation";
    }
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent,
            BindingResult theBindingResult){
        if (theBindingResult.hasErrors()){
            return "student-form";
        }else{
            return "student-confirmation";
        }
    }
}
