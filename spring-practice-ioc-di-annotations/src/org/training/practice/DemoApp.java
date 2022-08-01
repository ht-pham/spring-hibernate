/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.training.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author huongpham
 */
public class DemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container 
                = new AnnotationConfigApplicationContext(SportConfiguration.class);
        // Generate Beans by creating Coach object
        Coach coach = container.getBean("swimCoach", Coach.class);
        
        // Print out some info
        System.out.println(coach.getDailyWorkout());
        
        // Close the container
        container.close();
    }
}
