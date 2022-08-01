
package com.novicecoder.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huongpham
 */
public class DemoApp {
    public static void main(String[] args) {
        // read Spring conf file => create the spring container
        /**
        ClassPathXmlApplicationContext context 
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        **/
        AnnotationConfigApplicationContext context 
                = new AnnotationConfigApplicationContext(SportConfig.class);
        // get a bean from the spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        System.out.println("---------------------------------------------------------");
        // call a method on bean
        System.out.println(coach.getEmail());
        System.out.println(coach.getTeam());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortuneCookie());
        
        
        // get a bean from the spring container
        System.out.println("---------------------------------------------------------");
        Coach anotherCoach = context.getBean("swimCoach",Coach.class);
        
        // call a method on bean
        System.out.println(anotherCoach.getEmail());
        System.out.println(anotherCoach.getTeam());
        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(anotherCoach.getFortuneCookie());
        
        // get a bean from spring container
        Coach theCoach = context.getBean("raceCoach",Coach.class);
        System.out.println("---------------------------------------------------------");
        // call a method on bean
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneCookie());
        // close the context
        context.close();
    }
}
