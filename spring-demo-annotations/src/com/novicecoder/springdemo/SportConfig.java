/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author huongpham
 */
@Configuration
@ComponentScan("com.novicecoder.springdemo")
@PropertySource("classpath:contact.properties")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService(){
        System.out.println("SportConfig: >>> generate sad fortune service bean");
        return new SadFortuneService();
    }
    @Bean
    public Coach raceCoach(){
        System.out.println("SportConfig: >>> generate race coach bean");
        return new RaceCoach(sadFortuneService());
    }
}
