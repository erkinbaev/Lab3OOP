package com.natlusrun.task3;

import java.util.ArrayList;

public class Service {
    private ArrayList<Computer> computer = new ArrayList<Computer>();

    public void addComputer(Computer e){
        computer.add(e);
    }

    public void printService(){
        int numOfLaptops = 0;
        int numOfSmatphones = 0;
        System.out.println("На сервисе: ");
        for (Computer c:computer){
            if(c instanceof Laptop) {
                numOfLaptops = numOfLaptops + 1;
                System.out.println("\t" + c.toString());

            } else if(c instanceof Smartphone){
                numOfSmatphones = numOfSmatphones + 1;
                System.out.println("\t" + c.toString());
            }
        }
      System.out.println(numOfLaptops + " ноутбуков и " + numOfSmatphones + " смартфонов");
    }
}
