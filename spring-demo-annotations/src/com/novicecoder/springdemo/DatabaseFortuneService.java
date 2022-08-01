/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicecoder.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 *
 * @author huongpham
 */
@Component
public class DatabaseFortuneService implements FortuneService {
    
    @Override
    public String getFortune() {
        File file = new File("/Users/huongpham/NetBeansProjects/spring-demo-annotations/src/fortunes-data.txt");
        List<String> fortunes = new ArrayList<>();
        System.out.println("Does file exist? "+file.exists());
        
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    fortunes.add(scanner.nextLine());
                    
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                return "Ops, the coming of the fortune is delayed. Please be patient.";
            }
        }

        int randomInt = new Random().nextInt(fortunes.size());
       
        return fortunes.get(randomInt);
        
    }
    
    
}
