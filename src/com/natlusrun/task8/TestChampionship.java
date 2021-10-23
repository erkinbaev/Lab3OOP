package com.natlusrun.task8;

public class TestChampionship {

    public static void main(String[] args) {
        Personal competition1 = new Personal("самолет", "Boing");
        Comand competition2 = new Comand("вертолет", "Akula");
        Personal competition3 = new Personal("самолет", "TY154");
        Personal competition4 = new Personal("самолет", "Бумажный самолет");
        Comand competition5 = new Comand("вертолет", "Черный ястреб");
        Comand competition6 = new Comand("вертолет", "Сокол тысячалетия");
        ChampionShip championship = new ChampionShip();
        championship.addCompetition(competition1);
        championship.addCompetition(competition2);
        championship.addCompetition(competition3);
        championship.addCompetition(competition4);
        championship.addCompetition(competition5);
        championship.addCompetition(competition6);
        championship.printChampionship();
    }
}
