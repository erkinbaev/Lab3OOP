package com.natlusrun.task4;

public class Magazines extends Edition {
    private String name;

    public Magazines(String company, int year, String magName) {
        super(company, year);
        name = magName;
    }

    public void setName(String magName){
        name = magName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getCompany()+ " " + getYear() + " " + name;
    }
}
