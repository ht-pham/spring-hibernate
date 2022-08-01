/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author huongpham
 */
public class RaceCoach implements Coach {
    private FortuneService fortuneService;
    @Value("${race.email}")
    private String email;

    @Value("${race.team}")
    private String team;
    
    public RaceCoach(FortuneService fortune){
        fortuneService = fortune;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice running 5K daily";
    }

    @Override
    public String getFortuneCookie() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmail() {
        return "Email: "+ email;
    }

    @Override
    public String getTeam() {
        return "Team: "+team;
    }
    
}
