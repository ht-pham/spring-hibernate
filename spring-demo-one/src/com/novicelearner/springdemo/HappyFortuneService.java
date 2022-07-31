/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo;

/**
 *
 * @author huongpham
 */

import java.util.Random;

public class HappyFortuneService implements FortuneService{
    
    @Override
    public String getDailyFortune(){
        
        
        
        String[] allFortunes = new String[]{"Today is your lucky day!","Good news to come!","Patience is key"};
        int upperbound = 3;
        int randomInt = new Random().nextInt(upperbound); //Return a random int 0-2
        return allFortunes[randomInt];
       
    }
}
