/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo;

/**
 *
 * @author huongpham
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    public TrackCoach(){
        
    }
    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }
    
    // add an init method
    public void startBeans(){
        System.out.println("TrackCoach: create beans");
    }
    // add a destroy methdd
    public void destroyBeans(){
        System.out.println("TrackCoach: clean up and destroy beans");
    }
    
}
