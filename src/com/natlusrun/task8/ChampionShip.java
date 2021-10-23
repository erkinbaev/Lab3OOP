package com.natlusrun.task8;

import java.util.ArrayList;

public class ChampionShip {
    private ArrayList<Competition> competition = new ArrayList<Competition>();

    public void addCompetition(Competition c){
        competition.add(c);
    }

    public void printChampionship(){
        int numOfPersonal = 0;
        int numOfComand = 0;
        System.out.println("Всего чемпионатов: ");
        for (Competition c: competition){
            if(c instanceof Personal) {
                numOfPersonal = numOfPersonal + 1;
                System.out.println("\t" + c.toString());

            } else if(c instanceof Comand){
                numOfComand = numOfComand + 1;
                System.out.println("\t" + c.toString());
            }
        }
      System.out.println(numOfPersonal + " личных и " + numOfComand + " командных");
    }
}
