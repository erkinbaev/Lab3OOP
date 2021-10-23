package com.natlusrun.task2;

public class Employee {
    String employeeName;
    String employeeTypeOfWork;

    public void setName(String name){
        employeeName = name;
    }

    public void setEmployeeTypeOfWork(String typeOfWork){
        employeeTypeOfWork = typeOfWork;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmployeeTypeOfWork(){
        return employeeTypeOfWork;
    }

    public Employee(String name, String typeOfWork){
        employeeName = name;
        employeeTypeOfWork = typeOfWork;
    }

}
