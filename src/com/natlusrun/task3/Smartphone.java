package com.natlusrun.task3;

public class Smartphone extends Computer {
    private String modelOfPhone;

    public Smartphone(String company, int year, String model) {
        super(company, year);
        modelOfPhone = model;
    }

    public void setModelOfPhone(String model){
        modelOfPhone = model;
    }

    public String getModelOfPhone(){
        return modelOfPhone;
    }

    public String toString(){
        return getCompany()+ " " + getYear() + " " + modelOfPhone;
    }
}
