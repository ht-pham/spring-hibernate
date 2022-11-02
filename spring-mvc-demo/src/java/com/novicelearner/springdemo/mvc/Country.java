/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novicelearner.springdemo.mvc;

import java.util.LinkedHashMap;

/**
 *
 * @author huongpham
 */
public class Country {
    private LinkedHashMap<String,String> listOfCountries;
    
    public LinkedHashMap<String, String> getListOfCountries() {
        return listOfCountries;
    }
    
    public Country(){
        listOfCountries = new LinkedHashMap<>();
        
        listOfCountries.put("AE","United Arab Emirates");
        listOfCountries.put("AF","Afghanistan");
        listOfCountries.put("AR","Argentina");
        listOfCountries.put("AT","Austria");
        listOfCountries.put("AU","Australia");
        listOfCountries.put("BD","Bangladesh");
        listOfCountries.put("BE","Belgium");
        listOfCountries.put("BO","Bolivia");
        listOfCountries.put("BR","Brazil");
        listOfCountries.put("CA","Canada");
        listOfCountries.put("CF","Central African Republic");
        listOfCountries.put("CG","Congo");
        listOfCountries.put("CH","Switzerland");
        listOfCountries.put("CN","China");
        listOfCountries.put("DE","Germany");
        listOfCountries.put("DK","Denmark");
        listOfCountries.put("DO","Dominican Republic");
        listOfCountries.put("EG","Egypt");
        listOfCountries.put("ES","Spain");
        listOfCountries.put("FI","Finland");
        listOfCountries.put("FR","France");
        listOfCountries.put("GR","Greece");
        listOfCountries.put("HK","Hong Kong");
        listOfCountries.put("ID","Indonesia");
        listOfCountries.put("IE","Ireland");
        listOfCountries.put("IL","Israel");
        listOfCountries.put("IN","India");
        listOfCountries.put("IQ","Iraq");
        listOfCountries.put("IS","Iceland");
        listOfCountries.put("IT","Italy");
        listOfCountries.put("JM","Jamaica");
        listOfCountries.put("JO","Jordan");
        listOfCountries.put("JP","Japan");
        listOfCountries.put("KE","Kenya");
        listOfCountries.put("KR","Republic of Korea");
        listOfCountries.put("LB","Lebanon");
        listOfCountries.put("LK","Sri Lanka");
        listOfCountries.put("LU","Luxembourg");
        listOfCountries.put("MA","Morocco");
        listOfCountries.put("MC","Manaco");
        listOfCountries.put("MM","Myanmar");
        listOfCountries.put("MX","Mexico");
        listOfCountries.put("MY","Malaysia");
        listOfCountries.put("NG","Nigeria");
        listOfCountries.put("NL","Netherlands");
        listOfCountries.put("NO","Norway");
        listOfCountries.put("NZ","New Zealand");
        listOfCountries.put("PE","Peru");
        listOfCountries.put("PH","Philippines");
        listOfCountries.put("PK","Pakistan");
        listOfCountries.put("PL","Poland");
        listOfCountries.put("PS","State of Palestine");
        listOfCountries.put("RU","Russian Federation");
        listOfCountries.put("SA","Saudi Arabia");
        listOfCountries.put("SE","Sweden");
        listOfCountries.put("SG","Singapore");
        listOfCountries.put("SK","Slovakia");
        listOfCountries.put("TH","Thailand");
        listOfCountries.put("UA","Ukraine");
        listOfCountries.put("UG","Uganda");
        listOfCountries.put("UK","United Kingdom");
        listOfCountries.put("US","United States of America");
        listOfCountries.put("VA","Holy See");
        listOfCountries.put("VE","Venezuela");
        listOfCountries.put("VN","Vietnam");
        listOfCountries.put("YE","Yemen");
        listOfCountries.put("ZA","South Africa");
    }
}
