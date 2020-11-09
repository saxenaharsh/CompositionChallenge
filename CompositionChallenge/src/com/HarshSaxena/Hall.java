package com.HarshSaxena;

public class Hall {
    private Wall wall;
    private TV tv;
    private Sofa sofa;

    public Hall(Wall wall, TV tv, Sofa sofa) {
        this.wall = wall;
        this.tv = tv;
        this.sofa = sofa;
    }

    public void displayWallDimensions(){
        wall.wallDimensions(35, 25, 10);
        TvStatus();

    }
    public void TvStatus(){
        tv.turnOnTv();
    }

    /*private  Wall getWall() {
        return wall;
    }

    private TV getTv() {
        return tv;
    }

    private Sofa getSofa() {
        return sofa;
    }*/
}
