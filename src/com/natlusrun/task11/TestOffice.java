package com.natlusrun.task11;

public class TestOffice {

        public static void main(String[] args) {
            Printer orgtechnik1 = new Printer("самолет", "Boing");
            Scanner orgtechnik2 = new Scanner("вертолет", "Akula");
            Printer orgtechmik3 = new Printer("самолет", "TY154");
            Printer orgtechnik4 = new Printer("самолет", "Бумажный самолет");
            Scanner orgtechnik5 = new Scanner("вертолет", "Черный ястреб");
            Scanner orgtechnik6 = new Scanner("вертолет", "Сокол тысячалетия");
            Office office = new Office();
            office.addOrgTechnik(orgtechnik1);
            office.addOrgTechnik(orgtechnik2);
            office.addOrgTechnik(orgtechmik3);
            office.addOrgTechnik(orgtechnik5);
            office.addOrgTechnik(orgtechnik6);
            office.addOrgTechnik(orgtechnik4);
            office.printOrgTechnik();
        }

    }
