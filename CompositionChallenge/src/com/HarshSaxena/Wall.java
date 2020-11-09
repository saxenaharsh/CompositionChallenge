package com.HarshSaxena;

import java.awt.*;

public class Wall {
    private String name;
    private Dimensions dimensions;

    public Wall(String name, Dimensions dimensions) {
        this.name = name;
        this.dimensions = dimensions;
    }
    public void wallDimensions(int length, int width, int height){
        System.out.println("The dimensions of the wall are " + (length * width * height));
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
