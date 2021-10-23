package com.natlusrun.task9;

import java.util.ArrayList;

public class Chamber {
    private ArrayList<Furniture> furniture = new ArrayList<Furniture>();

    public void addFurniture(Furniture f){
        furniture.add(f);
    }

    public void printChamber(){
        int numOfSofa = 0;
        int numOfCupboard = 0;
        System.out.println("В комнате: ");
        for (Furniture f: furniture){
            if(f instanceof Sofa) {
                numOfSofa = numOfSofa + 1;
                System.out.println("\t" + f.toString());

            } else if(f instanceof Cupboard){
                numOfCupboard = numOfCupboard + 1;
                System.out.println("\t" + f.toString());
            }
        }
      System.out.println(numOfSofa + " диванов и " + numOfCupboard + " шкафов");
    }
}
