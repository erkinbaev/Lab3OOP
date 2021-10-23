package com.natlusrun.task6;

public class VideoFile extends File {
    private String name;

    public VideoFile(int size, String fileName) {
        super(size);
        name = fileName;
    }

    public void setName(String videoName){
        name = videoName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getSize() + " " + getName();
    }
}
