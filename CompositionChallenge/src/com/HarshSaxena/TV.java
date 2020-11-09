package com.HarshSaxena;

import java.sql.SQLOutput;

public class TV {
    private String name;
    private String type;
    private int ram;
    private String storage;

    public TV(String name, String type, int ram, String storage) {
        this.name = name;
        this.type = type;
        this.ram = ram;
        this.storage = storage;
    }

    public void turnOnTv(){
        System.out.println("The TV is turned on");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }
}
