/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author huongpham
 */
public class Customer {
    private String firstName;
    
    @NotNull(message="required field")
    @Size(min=2,message="required field")
    private String lastName;
    
    //@Pattern(regexp="^[1-9].+",message="Must be a valid number")
    @Min(value=16,message="Must be at least 16 years old to signup")
    @Max(value=120,message="Make sure there is no typo in Age field")
    private Integer age;
    
    @Pattern(regexp="^[0-9]{5}(?:-[0-9]{4})?$",message="Must be 5-digit or 9-digit ZIP code")
    private String postalCode;
    //private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
}
