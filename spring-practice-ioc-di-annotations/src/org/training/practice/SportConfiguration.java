/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.training.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author huongpham
 */
@Configuration
public class SportConfiguration {
    @Bean
    public FortuneService todayFortune(){
        System.out.println("SportConfiguration: >>> Generate the TodayFortune bean");
        return new TodayFortune();
    }
    @Bean
    public Coach swimCoach(){
        System.out.println("SportConfiguration: >>> Generate the SwimCoach bean");
        return new SwimCoach(todayFortune());
    }
}
