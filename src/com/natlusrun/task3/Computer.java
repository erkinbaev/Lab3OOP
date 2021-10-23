package com.natlusrun.task3;

public class Computer {
    int year;
    String company;

    public void setYear(int number){
        year = number;
    }

    public void setCompany(String name){
        company = name;
    }

    public int getYear(){
        return year;
    }

    public String getCompany(){
        return company;
    }

    public Computer(String name, int yearProduction){
        company = name;
        year = yearProduction;
    }

}
