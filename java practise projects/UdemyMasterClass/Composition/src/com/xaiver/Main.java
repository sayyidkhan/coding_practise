package com.xaiver;

public class Main {

    public static void main(String[] args) {

        // learning how to use Composition OOP Concept

        // Case
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase;
        theCase = new Case("220B","DELL","240",dimensions);

        // Monitor
        Monitor theMontior;
        theMontior = new Monitor("27 Inch", "ACER",27, new Resolution(2540,1440));

        // Motherboard
        Motherboard theMotherboard;
        theMotherboard = new Motherboard("BJ-200","Asus",4,6,"V2.44");

        // thePC
        PC thePC;
        thePC = new PC(theCase,theMontior,theMotherboard);

        /* how to access a method in a class where "inheritance" is not being used
        1. call the method for the PC class to call the monitor class
        2. call the method write pixels, to access the pixel method which is not available in the PC class
         */

        // call the draw pixel class
        thePC.getMonitor().drawPixelAt(1500,1200,"RED");

        // call the load program class
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}
