package com.novicelearner.springdemo;

/**
 *
 * @author huongpham
 * 
 * Description:
 * A Project Demo #1 in Udemy Course: Spring & Hibernate for Beginners
 * 
 */

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    
    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Spend 30mins on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }
}
