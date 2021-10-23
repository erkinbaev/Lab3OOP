package com.natlusrun.task11;

import java.util.ArrayList;

public class Office {
    private ArrayList<OrgTechnik> orgTech = new ArrayList<OrgTechnik>();

    public void addOrgTechnik(OrgTechnik a){
        orgTech.add(a);
    }

    public void printOrgTechnik(){
        int numOfPrinters = 0;
        int numOfScanners = 0;
        System.out.println("In office there are: ");
        for (OrgTechnik a: orgTech){
            if(a instanceof Printer) {
                numOfPrinters = numOfPrinters + 1;
                System.out.println("\t" + a.toString());

            } else if(a instanceof Scanner){
                numOfScanners = numOfScanners + 1;
                System.out.println("\t" + a.toString());
            }
        }
        System.out.println(numOfPrinters + " printers and" + numOfScanners + " scanners");
    }

}
