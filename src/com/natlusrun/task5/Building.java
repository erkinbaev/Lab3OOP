package com.natlusrun.task5;

import java.util.ArrayList;

public class Building {
    private ArrayList<Premises> premises = new ArrayList<Premises>();

    public void addPremise(Premises e){
        premises.add(e);
    }

    public void printPremises(){
        int numOfRooms = 0;
        int numOfOffices = 0;
        System.out.println("В здании: ");
        for (Premises p:premises){
            if(p instanceof Room) {
                numOfRooms = numOfRooms + 1;
                System.out.println("\t" + p.toString());

            } else if(p instanceof Office){
                numOfOffices = numOfOffices + 1;
                System.out.println("\t" + p.toString());
            }
        }
      System.out.println(numOfRooms + " квартир и " + numOfOffices + " офисов");
    }
}
