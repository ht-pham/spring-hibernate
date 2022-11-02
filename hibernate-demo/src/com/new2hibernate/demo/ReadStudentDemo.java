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
public class ReadStudentDemo {
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
            /** STEP 1: CREATE DEMO **/
            // Use Session object to save/retrieve Java object
            System.out.print("Creating new Student objects...");
            //Student tempStudent1 = new Student("Charles","Conroy","charles.conroy@new2hibernate.academy.edu");
            Student tempStudent2 = new Student("Sparsh","Patel","sparsh.patel@new2hibernate.academy.edu");
            //Student tempStudent3 = new Student("Kimberly","Kirk","kimberly.kirk@new2hibernate.academy.edu");
            Student tempStudent1 = new Student("Victor","Yi","victor.yi@hibernate.training.org");
            //Student tempStudent2 = new Student("Sammy","Smith","samathan.smith@hibernate.training.org");
            Student tempStudent3 = new Student("Evan","Hilton","evan.hilton@hibernate.training.org");
            System.out.println(" 50% Completed...");
            
            // start transaction
            session.beginTransaction();
            
            // save Student object
            System.out.println("Saving the new Student objects...");
            session.save(tempStudent1);
            System.out.println("Saved student. Generated Id: "+tempStudent1.getId());
            session.save(tempStudent2);
            System.out.println("Saved student. Generated Id: "+tempStudent2.getId());
            session.save(tempStudent3);
            System.out.println("Saved student. Generated Id: "+tempStudent3.getId());
            
            System.out.println(" 90% Completed...");
            
            // commit the transaction
            System.out.println("Commiting change made to the database...");
            session.getTransaction().commit();
            System.out.println("100% Completed");
            
            /** STEP 2: READ DEMO aka RETRIEVE DATA **/
            System.out.println("Trying to retrieve student IDs for the new students...");
            // because the previous session is already commited
            System.out.println("New session began..."); 
            session = factory.getCurrentSession();
            
            // begin READ transaction
            session.beginTransaction(); 
            // Retrieve one student info via primary key
            System.out.println("Getting new student info with student id "+tempStudent2.getId());
            
            Student theChosenOne = session.get(Student.class,tempStudent2.getId());
            System.out.println("Returning the saved info of the student...");
            System.out.println(theChosenOne.toString());
            
            // commit the transaction
            System.out.println("Finished reading student info... Close the session...");
            session.getTransaction().commit();
            System.out.println("Closed!");
            
        } finally{
            factory.close();
        }
        
    }
}
