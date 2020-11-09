package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(60, 40, 20 );
        Wall theWall = new Wall("DisplayWall", dimensions );

        TV theTv = new TV("TCL", "smart", 1, "16 Gigs");
        Sofa theSofa = new Sofa("Chesterfield", "Blue", 4);
        Hall theHall = new Hall(theWall, theTv, theSofa);

//        theHall.getWall().wallDimensions(60, 40, 20);
//        theHall.getTv().turnOnTv();
//        theHall.getSofa().hasRemote(false);
        theHall.displayWallDimensions();








    }
}
