package com.natlusrun.task10;

import java.util.ArrayList;

public class Armouries {
    private ArrayList<Weapon> weapon = new ArrayList<Weapon>();

    public void addWeapon(Weapon w){
        weapon.add(w);
    }

    public void printChamber(){
        int numOfCold = 0;
        int numOfFire = 0;
        System.out.println("В оружейной палате: ");
        for (Weapon w: weapon){
            if(w instanceof Cold) {
                numOfCold = numOfCold + 1;
                System.out.println("\t" + w.toString());

            } else if(w instanceof FireArms){
                numOfFire = numOfFire + 1;
                System.out.println("\t" + w.toString());
            }
        }
      System.out.println(numOfCold + " холодных и " + numOfFire + " огнестрельных оружий");
    }
}
