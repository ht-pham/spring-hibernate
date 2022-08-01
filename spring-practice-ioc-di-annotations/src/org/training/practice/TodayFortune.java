/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.training.practice;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */

public class TodayFortune implements FortuneService {
    private String[] fortuneList = new String[]{
            "Today is a sunny day!","Practice today to get victory tomorrow",
            "Stay dilligent & hopeful!", "Your rewards for hard work is comming",
            "Swim like there is no river bank around", "You can't see rainbow without a rain"
            };
    @Override
    public String getFortune() {
        Random generator = new Random();
        Integer index = generator.nextInt(fortuneList.length);
        return fortuneList[index];
    }
    
}
