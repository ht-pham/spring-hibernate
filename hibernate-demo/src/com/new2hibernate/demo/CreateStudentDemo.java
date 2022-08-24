/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.new2hibernate.demo;


import com.new2hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author huongpham
 */
public class CreateStudentDemo {
    //public static void main(String[] args){
    public void main(){
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();
        
        // create session
        System.out.println("Started a new session...");
        Session session = factory.getCurrentSession();
            
        try{
            // Use Session object to save/retrieve Java object
            System.out.print("Creating new Student objects...");
            Student tempStudent1 = new Student("Peter","Parker","peter.parker@new2hibernate.academy.edu");
            Student tempStudent2 = new Student("Mary-Jane","Chandler","mary.jane.chandler@new2hibernate.academy.edu");
            Student tempStudent3 = new Student("Charlotte","Lewis","charlotte.lewis@new2hibernate.academy.edu");
            System.out.println(" 50% Completed...");
            

            // start transaction
            session.beginTransaction();
            
            // save Student object
            System.out.println("Saving the new Student objects...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);
            System.out.println(" 90% Completed...");
            
            // commit the transaction
            System.out.println("Commiting change made to the database...");
            session.getTransaction().commit();
            System.out.println("100% Completed");
        } finally{
            factory.close();
        }
        
    }
}
