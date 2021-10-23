package com.natlusrun.task6;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<File> file = new ArrayList<File>();

    public void addFile(File e){
        file.add(e);
    }

    public void printCatalog(){
        int numOfAudioFiles = 0;
        int numOfVideoFiles = 0;
        System.out.println("В каталоге: ");
        for (File f:file){
            if(f instanceof AudioFile) {
                numOfAudioFiles = numOfAudioFiles + 1;
                System.out.println("\t" + f.toString());

            } else if(f instanceof VideoFile){
                numOfVideoFiles = numOfVideoFiles + 1;
                System.out.println("\t" + f.toString());
            }
        }
      System.out.println(numOfAudioFiles + " aудиофайлов " + numOfVideoFiles + " видеофайлов");
    }
}
