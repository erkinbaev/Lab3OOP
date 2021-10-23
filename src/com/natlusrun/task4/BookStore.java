package com.natlusrun.task4;

import java.util.ArrayList;

public class BookStore {
    private ArrayList<Edition> edition = new ArrayList<Edition>();

    public void addBook(Edition e){
        edition.add(e);
    }

    public void printBooks(){
        int numOfBooks = 0;
        int numOfMagazines = 0;
        System.out.println("В книжном магазине: ");
        for (Edition e:edition){
            if(e instanceof Books) {
                numOfBooks = numOfBooks + 1;
                System.out.println("\t" + e.toString());

            } else if(e instanceof Magazines){
                numOfMagazines = numOfMagazines + 1;
                System.out.println("\t" + e.toString());
            }
        }
      System.out.println(numOfBooks + " книг и " + numOfMagazines + " журналов");
    }
}
