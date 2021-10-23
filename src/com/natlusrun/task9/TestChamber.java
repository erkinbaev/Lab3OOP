package com.natlusrun.task9;

public class TestChamber {

    public static void main(String[] args) {
        Sofa furniture1 = new Sofa("диван", "Red");
        Cupboard furniture2 = new Cupboard("шкаф", "Green");
        Sofa furniture3 = new Sofa("диван", "Yellow");
        Sofa furniture4 = new Sofa("диван", "Black");
        Cupboard furniture5 = new Cupboard("шкаф", "Blue");
        Cupboard furniture6 = new Cupboard("шкаф", "White");
        Chamber chamber = new Chamber();
        chamber.addFurniture(furniture1);
        chamber.addFurniture(furniture2);
        chamber.addFurniture(furniture3);
        chamber.addFurniture(furniture4);
        chamber.addFurniture(furniture5);
        chamber.addFurniture(furniture6);
        chamber.printChamber();
    }
}
