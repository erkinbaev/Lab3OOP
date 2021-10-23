package com.natlusrun.task6;

public class TestCatalog {

    public static void main(String[] args) {
        AudioFile file1 = new AudioFile(10, "Paris, else");
        VideoFile file2 = new VideoFile(1024, "Terminator");
        AudioFile file3 = new AudioFile(12, "Merry Christmas");
        AudioFile file4 = new AudioFile(8, "Я буду руки твои целовать!");
        VideoFile file5 = new VideoFile(2040, "It course");
        VideoFile file6 = new VideoFile(2020, "12Pro");
        Catalog catalog = new Catalog();
        catalog.addFile(file1);
        catalog.addFile(file2);
        catalog.addFile(file3);
        catalog.addFile(file4);
        catalog.addFile(file5);
        catalog.addFile(file6);
        catalog.printCatalog();
    }
}
