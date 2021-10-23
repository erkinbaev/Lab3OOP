package com.natlusrun.task11;

public class Printer extends OrgTechnik {
    String name;

    public Printer(String type, String name) {
        super(type);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String toString(){
        return getType()+ " "  + getName();
    }

}
