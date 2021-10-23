package com.natlusrun.task7;

import java.util.ArrayList;

public class Airline {
    private ArrayList<AirCraft> aircraft = new ArrayList<AirCraft>();

    public void addAirCraft(AirCraft a){
        aircraft.add(a);
    }

    public void printAirline(){
        int numOfAirPlanes = 0;
        int numOfHelicopters = 0;
        System.out.println("В авиакомпании: ");
        for (AirCraft a: aircraft){
            if(a instanceof AirPlane) {
                numOfAirPlanes = numOfAirPlanes + 1;
                System.out.println("\t" + a.toString());

            } else if(a instanceof Helicopter){
                numOfHelicopters = numOfHelicopters + 1;
                System.out.println("\t" + a.toString());
            }
        }
      System.out.println(numOfAirPlanes + " самолетов " + numOfHelicopters + " вертолетов");
    }
}
