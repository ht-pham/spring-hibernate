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
public class UpdateStudentDemo {
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
            // start transaction #1: Update database via setter methods
            session.beginTransaction();
            
            // calling the Student object with the randomized studentId
            Random generator = new Random();
            int studentId=0;
            while(studentId<=0){
                studentId= generator.nextInt(7); //generate a number from 0 to 6
            }
            Student theStudent = session.get(Student.class,studentId);
            System.out.println("Getting a student from the table...\n" +theStudent);
            
            // update student info via setters
            System.out.println("Updating student email...");
            String studentEmail = theStudent.getEmail();
            int atSign = studentEmail.indexOf("@");
            String newEmail = studentEmail.replaceAll("[@].+", "@hibernate.academy.com");
            theStudent.setEmail(newEmail);
            System.out.println("Changed from: "+studentEmail.substring(atSign));
            System.out.println(" to: "+newEmail.substring(atSign));
            
            // check if the change was successfully implemented
            if (studentEmail.equalsIgnoreCase(newEmail)){
                System.out.println("The student email is already updated in a previous transaction");
            }else{
                System.out.println("Returning the student info for the student (ID: "+
                    studentId+")\n"+theStudent);
            }
            
            // commit the transaction
            System.out.println("End the current transaction...");
            session.getTransaction().commit();
            System.out.println("Committed!");
            
            // start transaction #2: Update database using query
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Removing emails of those students from New2Hibernate Academy");
            session.createQuery("update Student set email=NULL "
                    + "where email like '%new2hibernate.academy.edu'").executeUpdate();
            
            List<Student> studentList = 
                    session.createQuery("from Student as s where s.email=NULL")
                            .getResultList();
            
            // Print out the list
            System.out.println("Migrating old email domain '@new2hibernate.academy.edu' to "
                    + " '@hibernate.academy.com'");
            for (Student student: studentList){
                System.out.println(student);
                System.out.println("Creating a new email for the student");
                String newStudentEmail = student.getFirstName()+"."+student.getLastName()+"@hibernate.academy.com";
                System.out.println("New email: "+newStudentEmail);
                student.setEmail(newStudentEmail);
                System.out.println("Finished setting up the new email");
            }
            
            
            
            // commit the transaction
            System.out.println("Committing changes...");
            session.getTransaction().commit();
            System.out.println("Committed!");
            
        } finally{
            factory.close();
        }
        
    }
}
