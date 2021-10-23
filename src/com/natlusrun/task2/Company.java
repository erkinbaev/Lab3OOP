package com.natlusrun.task2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employee = new ArrayList<Employee>();

    public void addEmployee(Employee e){
        employee.add(e);
    }

    public void printCompany(){
        int numOfHPEmployee = 0;
        int numOfSalaryEmployee = 0;
        System.out.println("В компании: ");
        for (Employee e:employee){
            if(e instanceof HourlyPayment) {
                numOfHPEmployee = numOfHPEmployee + 1;
                System.out.println("\t" + e.toString());

            } else if(e instanceof Salary){
                numOfSalaryEmployee = numOfSalaryEmployee + 1;
                System.out.println("\t" + e.toString());
            }
        }
      System.out.println(numOfHPEmployee + " работников с почасовой оплатой и " + numOfSalaryEmployee + " работников с " +
              "окладом");
    }
}
