package com.natlusrun.task11;

public class Scanner extends OrgTechnik {
    String name;

    public Scanner(String type, String name) {
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
