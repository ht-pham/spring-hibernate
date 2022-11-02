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

/**
 *
 * @author huongpham
 */
public class QueryStudentDemo {
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
            // start transaction
            session.beginTransaction();
            
            // create a new query to retrieve all student
            System.out.println("Begin retrieving all data from Student table");
            inquireData(session,"from Student");
            
            System.out.println("Begin retrieving students from Hibernate Training Organization");
            String query = "from Student as s "
                    +"where s.email like '%training.org'";
            inquireData(session,query);
            
            System.out.println("Begin retrieving students from Hibernate Academy");
            query = "from Student as s "
                    +"where s.email like '%academy.edu'";
            inquireData(session,query);
            
            System.out.println("Begin retrieving students "
                    + "whose first name is Patrick "
                    + "or whose last name is Lin");
            query= "from Student as s "
                    +"where s.firstName='Patrick' or s.lastName='Lin'";
            inquireData(session,query);
            
            // commit the transaction
            System.out.println("Finish the transaction...");
            session.getTransaction().commit();
            System.out.println("100% done");
            
            
        } finally{
            factory.close();
        }
        
    }

    private static void inquireData(Session thisSession,String query) {
        List<Student> studentList = thisSession.createQuery(query).getResultList();
        
        // Print out the list
        for (Student student: studentList){
            System.out.println(student);
        }
    }
}
