package com.natlusrun.task5;

public class BuildingTest {

    public static void main(String[] args) {
        Room room1 = new Room("Room", 20, 1);
        Office office1 = new Office("Office", 200, 2);
        Room room2 = new Room("Room", 56, 3);
        Room room3 = new Room("Room", 100, 4);
        Office office2 = new Office("Office", 150, 5);
        Office office3 = new Office("Office", 1000, 6);
        Building building = new Building();
        building .addPremise(room1);
        building .addPremise(office1);
        building .addPremise(room2);
        building .addPremise(room3);
        building .addPremise(office2);
        building .addPremise(office3);
        building .printPremises();
    }
}
