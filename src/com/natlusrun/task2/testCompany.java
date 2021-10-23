package com.natlusrun.task2;

public class testCompany {

    public static void main(String[] args) {
        HourlyPayment hp1 = new HourlyPayment("Anashon", "designer", 20);
        Salary se1 = new Salary("Aidana", "SMM", 40000);
        HourlyPayment hp2 = new HourlyPayment("Aktilek", "sale manager", 100);
        Salary se2= new Salary("Nursultan", "manager", 100000);
        Company company = new Company();
        company.addEmployee(hp1);
        company.addEmployee(se1);
        company.addEmployee(hp2);
        company.addEmployee(se2);
        company.printCompany();
    }
}
