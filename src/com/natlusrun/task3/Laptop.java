package com.natlusrun.task3;

public class Laptop extends Computer {
    private String OS;

    public Laptop(String company, int year, String operationSystem) {
        super(company, year);
        OS = operationSystem;
    }


    public String getOS(){
        return OS;
    }

    public String toString(){
        return getCompany()+ " " + getYear() + " " + getOS();
    }
}
