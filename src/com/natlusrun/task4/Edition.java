package com.natlusrun.task4;

public class Edition {
    String name;
    int year;

    public void setYear(int number){
        year = number;
    }

    public void setName(String editionName){
        name = editionName;
    }

    public int getYear(){
        return year;
    }

    public String getCompany(){
        return name;
    }

    public Edition(String editionName, int yearProduction){
        name = editionName;
        year = yearProduction;
    }

}
