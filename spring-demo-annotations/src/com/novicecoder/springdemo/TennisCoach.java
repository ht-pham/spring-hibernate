/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    
    @Value("${bar.email}")
    private String email;

    @Value("${bar.team}")
    private String team;
    
    /**Autowired by constructor
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }**/
    
    
    // Autowired by setter
    public TennisCoach(){
        System.out.println("TennisCoach: >>> Inside the default constructor");
    }
    /**
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">>> Setter Injection: Assignment of FortuneService");
        fortuneService = theFortuneService;
    }**/
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    @Override
    public String getFortuneCookie() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmail() {
        return "Email: "+email;
    }

    @Override
    public String getTeam() {
        return "Team: "+team; 
    }
    
}
