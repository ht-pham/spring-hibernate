/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

//import java.util.LinkedHashMap;

import com.novicelearner.springdemo.mvc.validation.MajorCode;
import java.util.LinkedHashMap;


/**
 *
 * @author huongpham
 */

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String schoolYear;
    
    @MajorCode
    private String majorCode;
    
    private String[] courseList; // this is for form:checkbox demo
    private String[] electiveList; // this is for form:checkboxes demo
    private String[] selectedElective; // this is for form:checkboxes demo

    
    //** schoolYear as a list for form:radiobuttons
    private LinkedHashMap<String,String> schoolYearChoice;

    public LinkedHashMap<String, String> getSchoolYearChoice() {
        return schoolYearChoice;
    }
    
    /** The countryOptions is retrieved from Country class
    public Country countryISO = new Country();
    private LinkedHashMap<String,String> countryOptions;
    **/
    
    public Student(){
        this.setSchoolYearChoice();
        this.setElectiveList();
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }
    /** This function is only used when country options are retrieved from Country class
    public LinkedHashMap<String,String> getCountryOptions(){
        this.countryOptions = countryISO.getListOfCountries();
        return countryOptions;
    }**/
    public void setSchoolYearChoice(){
        schoolYearChoice = new LinkedHashMap<>();
        
        schoolYearChoice.put("Freshman", "Freshman" );
        schoolYearChoice.put("Sophomore", "Sophomore" );
        schoolYearChoice.put("Junior", "Junior" );
        schoolYearChoice.put("Senior", "Senior" );
    }
    public String[] getCourseList() {
        return courseList;
    }

    public void setCourseList(String[] courseList) {
        this.courseList = courseList;
    }
    
    public String[] getSelectedElective() {
        return selectedElective;
    }

    public void setSelectedElective(String[] selectedElective) {
        this.selectedElective = selectedElective;
    }
    
    public String[] getElectiveList() {
        return electiveList;
    }

    public void setElectiveList() {
        String[] fallElectives = new String[]{
            "Microeconomics","Macroeconomics","Organic Chemistry",
            "Philosophy I", "Ethics for Engineering", "Graph Theory",
            "World History I","French I", "Spanish I"
        };
        this.electiveList = fallElectives;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }
    
}
