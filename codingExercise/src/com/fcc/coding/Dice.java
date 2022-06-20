package com.fcc.coding;

/**
 * Dice object represents a single dice of NUM_SIDES sides, which is 6
 * by default or an be specified through the constructor
 */
public class Dice {

    private final int NUM_SIDES;
    private int value;

    //####### CONSTRUCTORS ########
    /**
     * Initializes dice with NUM_SIDE equals to 6 and an initial value of 1
     */
    public Dice(){
        NUM_SIDES = 6;
        value = 1;
    }

    /**
     * Initializes dice with NUM_SIDE equals to numSides and an initial value of 1
     */
    public Dice(int numSides){
        NUM_SIDES = numSides;
        value = 1;
    }

    public void setValue(int inValue){
        value = inValue;
    }

    public int getValue(){
        return value;
    }

    public int getNUM_SIDES(){
        return NUM_SIDES;
    }

    public String toString(){
        return String.valueOf(value);
    }

    /**
     * generates a psuedo-random valuefor the dice between 1 and NUM_SIDES
     */
    public void roll(){
        value = (int) (Math.random()*NUM_SIDES)+1;
    }

}
