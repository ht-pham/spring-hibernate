/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huongpham
 */
public class MyApp {
    
    public static void main(String[] args){
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle.xml");
        
        /**
         * applicationContext.xml
        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("cricketCoach",CricketCoach.class);
        
        // call methods on bean
        System.out.println("Email Address: "+theCoach.getEmailAddress());
        System.out.println("Team: "+theCoach.getTeam());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        
        // retrieve bean from spring container
        BaseballCoach myCoach = context.getBean("myCoach",BaseballCoach.class);
        
        // call methods on bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        
        **/
        
        /**
         * beanScope.xml
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        
        Coach myCoach = context.getBean("myCoach",Coach.class);
        
        // call methods on bean
        System.out.println(myCoach==theCoach);
        System.out.println("theCoach:"+theCoach);
        System.out.println("myCoach:"+myCoach);
        **/
        
        // beanLifecycle.xml
        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        
        
        // close the context
        context.close();
        
        
    }
}
