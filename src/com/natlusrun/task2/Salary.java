package com.natlusrun.task2;

public class Salary extends Employee {
    private int salary;

    public Salary(String name, String typeOfWork, int salaryAmount) {
        super(name, typeOfWork);
        salary = salaryAmount;
    }

    public void setSalary(int number){
        salary = number;
    }

    public int getNumberOfClass(){
        return salary;
    }

    public String toString(){
        return getEmployeeName()+ " " + getEmployeeTypeOfWork() + " " + salary;
    }
}
