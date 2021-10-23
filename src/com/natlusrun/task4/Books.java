package com.natlusrun.task4;

public class Books extends Edition {
    private String name;

    public Books(String company, int year, String bookName) {
        super(company, year);
        name = bookName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getCompany()+ " " + getYear() + " " + getName();
    }
}
