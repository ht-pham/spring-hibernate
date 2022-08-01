/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */
@Component
public class RandomFortuneService implements FortuneService {
    private String[] randomFortunes = new String[]{
            "Today is your lucky day", "Good news are coming",
            "Blessings are soon to come", "Patience is key",
            "Be aware of wolfs in the sheep's clothing",
            "The best yet to come", "High hopes"
            };
    private Random randomGenerator = new Random();
    
    @Override
    public String getFortune() {
        int randomNumber = randomGenerator.nextInt(randomFortunes.length);
        return randomFortunes[randomNumber];
    }
    
}
