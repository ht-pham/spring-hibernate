/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */
@Component
public class SwimCoach implements Coach {
    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;
    
    @Value("${fool.email}")
    private String email;

    @Value("${fool.team}")
    private String team;
    
    public SwimCoach(){
        System.out.println("SwimCoach: >>> Inside the default constructor");
  
    }
    
    // @PostConstructor annotation
    @PostConstruct
    public void startUpActivity(){
        System.out.println("SwimCoach: >>> Finished creating the object");
        System.out.println("SwimCoach: >>> Started reading fortunes-data.txt file");
        String fortune = this.getFortuneCookie();
        System.out.println("SwimCoach: >>> Finished reading fortunes-data.txt file");
        System.out.println("Fortune found: "+fortune);
        
    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("SwimCoach: >>> Clean up things");
    }
    /**
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">>> Setter Injection: Assignment of FortuneService");
        fortuneService = theFortuneService;
    }**/
    
    @Override
    public String getDailyWorkout() {
        return "Practice swimming 5 miles one-hour session";
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
