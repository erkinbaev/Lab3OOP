package com.natlusrun.task10;

public class TestArmouries {

    public static void main(String[] args) {
        Cold weapon1 = new Cold("холодное", "нож");
        FireArms weapon2 = new FireArms("огнестрел", "АК47");
        Cold weapon3 = new Cold("холодное", "сабля");
        Cold weapon4 = new Cold("холодное", "кастет");
        FireArms weapon5 = new FireArms("огнестрел", "м16");
        FireArms weapon6 = new FireArms("огнестрел", "макаров");
        Armouries armouries = new Armouries();
        armouries.addWeapon(weapon1);
        armouries.addWeapon(weapon2);
        armouries.addWeapon(weapon3);
        armouries.addWeapon(weapon4);
        armouries.addWeapon(weapon5);
        armouries.addWeapon(weapon6);
        armouries.printChamber();
    }
}
