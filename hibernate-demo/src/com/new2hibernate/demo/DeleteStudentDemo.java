/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.new2hibernate.demo;


import com.new2hibernate.demo.entity.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Random;
/**
 *
 * @author huongpham
 */
public class DeleteStudentDemo {
    public static void main(String[] args){
    //public void main(){
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();
        
        // create session
        System.out.println("Started a new session...");
        Session session = factory.getCurrentSession();
            
        try{
            // start transaction #1: Delete record from database via delete()
            session.beginTransaction();
            
            // calling the Student object with the randomized studentId
            int studentId = generateStudentID();
            
            Student theStudent = session.get(Student.class,studentId);
            System.out.println("Getting a student from the table...\n" +theStudent);
            
            System.out.println("Removing the student from the table...\n");
            session.delete(theStudent);
            
            
            // commit the transaction
            System.out.println("End the current transaction...");
            session.getTransaction().commit();
            System.out.println("Committed!");
            
            // start transaction #2: Delete record from database using query
            session = factory.getCurrentSession();
            session.beginTransaction();
            
            if (studentId!=6){
                session.createQuery("delete from Student where id=6").executeUpdate();
                System.out.println("Successfully removed student #6 from the database");
            }
            
            // commit the transaction
            System.out.println("Committing changes...");
            session.getTransaction().commit();
            System.out.println("Committed!");
            
        } finally{
            factory.close();
        }
        
    }
    public static int generateStudentID(){
        Random generator = new Random();
        int studentId=0;
        while(studentId<=0){
            studentId= generator.nextInt(13); //generate a number from 0 to 12
        }
        
        return studentId;
    }
}
