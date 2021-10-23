package com.natlusrun.task2;

public class HourlyPayment extends Employee {
    private int hourlyPayment;

    public HourlyPayment(String name, String typeOfWork, int payment) {
        super(name, typeOfWork);
        hourlyPayment = payment;
    }


    public int getHourlyPayment(){
        return hourlyPayment;
    }

    public String toString(){
        return getEmployeeName()+ " " + getEmployeeTypeOfWork() + " " + hourlyPayment;
    }
}
