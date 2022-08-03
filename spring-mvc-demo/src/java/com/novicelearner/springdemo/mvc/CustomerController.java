/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huongpham
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    /** add an InitBinder to convert, trim input strings
     * remove leading and trailing whitespace
     * resolve issue for our validation
     *  @param: (always) WebDataBinder data
     */
    @InitBinder
    public void initBinder(WebDataBinder data){
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        data.registerCustomEditor(String.class,stringTrimmer);
    }
    @RequestMapping("/newCustomerForm")
    public String showForm(Model theModel){
        theModel.addAttribute("newCustomer",new Customer());
        return "new-customer-form";
    }
    
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("newCustomer") Customer aCustomer,
            BindingResult theBindingResult){
        
        if (theBindingResult.hasErrors()){
            return "new-customer-form";
        }else{
            return "customer-confirmation";
        }
    }
    
}
