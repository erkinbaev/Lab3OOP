package com.natlusrun.task12;

import java.util.ArrayList;

public class Holding {
    private ArrayList<MassMedia> massMedia = new ArrayList<>();

    public void addMassMedia(MassMedia m){
        massMedia.add(m);
    }

    public void printHolding(){
        int numOfTvChannels = 0;
        int numOfMagazines = 0;
        System.out.println("В холдинге: ");
        for (MassMedia m: massMedia){
            if(m instanceof TvChannel) {
                numOfTvChannels = numOfTvChannels + 1;
                System.out.println("\t" + m.toString());

            } else if(m instanceof Magazines){
                numOfMagazines = numOfMagazines + 1;
                System.out.println("\t" + m.toString());
            }
        }
        System.out.println(numOfTvChannels + " телеканалов и " + numOfMagazines + " газет");
    }

}
