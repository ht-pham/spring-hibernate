/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author huongpham
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    @RequestMapping("/modifyData")
    public String modifyData(HttpServletRequest request,Model model){
        String input = request.getParameter("guestName");
        
        Character fLetter = input.charAt(0);
        String remainder = input.substring(1).toLowerCase();
        
        String formattedName = fLetter.toString().toUpperCase()+remainder;
        String result = "Hello & Welcome, "+formattedName+"!";
        model.addAttribute("message", result);
        
        return "helloworld";
    }
    
    @RequestMapping("/welcomePage")
    public String formatName(@RequestParam("guestName") String name,Model model){
        Character fLetter = name.charAt(0);
        String remainder = name.substring(1).toLowerCase();
        
        String formattedName = fLetter.toString().toUpperCase()+remainder;
        String result = "Hello & Welcome, "+formattedName+"!";
        model.addAttribute("message", result);
        
        return "helloworld";
    }
}
