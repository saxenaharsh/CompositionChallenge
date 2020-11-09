package com.HarshSaxena;

public class Sofa {
    private String name;
    private String color;
    private int seaterType;

    public Sofa(String name, String color, int seaterType) {
        this.name = name;
        this.color = color;
        this.seaterType = seaterType;
    }

    public void hasRemote(boolean remote){
        if(remote == true){
            System.out.println("Sofa can be managed using remote");
        }else{
            System.out.println("Sofa is to be managed manually");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSeaterType() {
        return seaterType;
    }
}
