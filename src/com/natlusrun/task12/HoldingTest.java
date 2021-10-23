package com.natlusrun.task12;

public class HoldingTest {
    public static void main(String[] args) {
        TvChannel massMedia1 = new TvChannel("канал", "CNN");
        Magazines massMedia2 = new Magazines("газета", "NY Times");
        Magazines massMedia3 = new Magazines("газета", "Вечерний Бишкек");
        Magazines massMedia4 = new Magazines("газета", "Ежедневный пророк");
        TvChannel massMedia5 = new TvChannel("канал", "ОРТ");
        TvChannel massMedia6 = new TvChannel("канал", "КТРК");
        Holding holding = new Holding();
        holding.addMassMedia(massMedia1);
        holding.addMassMedia(massMedia2);
        holding.addMassMedia(massMedia3);
        holding.addMassMedia(massMedia4);
        holding.addMassMedia(massMedia5);
        holding.addMassMedia(massMedia6);
        holding.printHolding();
    }

}
