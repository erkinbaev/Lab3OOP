package com.natlusrun.task7;

public class TestAirline {

    public static void main(String[] args) {
        AirPlane aircraft1 = new AirPlane("самолет", "Boing");
        Helicopter aircraft2 = new Helicopter("вертолет", "Akula");
        AirPlane aircraft3 = new AirPlane("самолет", "TY154");
        AirPlane aircraft4 = new AirPlane("самолет", "Бумажный самолет");
        Helicopter aircraft5 = new Helicopter("вертолет", "Черный ястреб");
        Helicopter aircraft6 = new Helicopter("вертолет", "Сокол тысячалетия");
        Airline airline = new Airline();
        airline.addAirCraft(aircraft1);
        airline.addAirCraft(aircraft2);
        airline.addAirCraft(aircraft3);
        airline.addAirCraft(aircraft4);
        airline.addAirCraft(aircraft5);
        airline.addAirCraft(aircraft6);
        airline.printAirline();
    }
}
