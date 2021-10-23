package com.natlusrun.task3;

public class testService {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", 2012, "Windows");
        Smartphone sp1 = new Smartphone("Samsung", 2016, "A3");
        Laptop laptop2 = new Laptop("Apple", 2014, "MacOS BigSur");
        Laptop laptop3 = new Laptop("Acer", 2020, "Windows");
        Smartphone sp2 = new Smartphone("Apple", 2020, "SE2");
        Smartphone sp3 = new Smartphone("Apple", 2020, "12Pro");
        Service service = new Service();
        service.addComputer(laptop1);
        service.addComputer(sp1);
        service.addComputer(laptop2);
        service.addComputer(laptop3);
        service.addComputer(sp2);
        service.addComputer(sp3);
        service.printService();
    }
}
