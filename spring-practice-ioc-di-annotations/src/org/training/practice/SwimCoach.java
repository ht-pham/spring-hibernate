/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.training.practice;

//import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */
@Component
public class SwimCoach implements Coach {
    private FortuneService reward;

    public SwimCoach(FortuneService luck){
        System.out.println("SwimCoach: >>> Inside SwimCoach() Constructor");
        reward = luck;
    }
    
    @PostConstruct
    public void announceUpdate(){
        System.out.println("SwimCoach@PostConstructor: >>> Inside announceUpdate()");
    }
    
    
    @Override
    public String getDailyWorkout() {
        return "SwimCoach: Required Pre-workout: 30mins of warmup exercise"
                + "\nSwimCoach: Swim 5K daily";
    }

    @Override
    public String getDailyFortune() {
        return reward.getFortune();
    }
    
    
    @PreDestroy
    public void cleanup(){
        System.out.println("SwimCoach@PreDestroy: >>> Inside cleanup()");
        System.out.println("SwimCoach@PreDestroy: >>> Reminder: "+getDailyFortune());
    }
}
