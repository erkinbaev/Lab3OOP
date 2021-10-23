package com.natlusrun.task6;

public class AudioFile extends File {
    private String name;

    public AudioFile(int size, String fileName) {
        super(size);
        name = fileName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getSize()+ " "  + getName();
    }
}
