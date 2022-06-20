package com.fcc.coding;

public class DiceSimulationGame {

    public int gameScore;

    public int numOfDice, simulations;

    // default constructor with dice using 2 and simulations 100
    public DiceSimulationGame(){
        numOfDice = 2;
        simulations = 100;
    }
    // Parameterized constructor
    public DiceSimulationGame(int numOfDice, int simulations){
        this.numOfDice = numOfDice;
        this.simulations = simulations;
    }

    public void playGame() {

        for(int i=0; i<simulations; i++){
            Dice[] dice = createDice(numOfDice);

            for(int j=0; j< dice.length;j++) {
                if(!(dice.length<=0)) {
                    rollDice(dice);
                }
                System.out.println("Initial Dice length "+ dice.length);
                dice = checkDice(dice);
                System.out.println("Dice length "+ dice.length);

            }
        }
    }

    private Dice[] checkDice(Dice[] dice) {
        for(Dice dice1: dice){
            if(dice1.getValue()==3){
                gameScore += 0;
                dice = removeTheElement(dice, dice1.getValue());
            }
            if(dice1.getValue() <3){
                gameScore += dice1.getValue();
                dice = removeTheElement(dice, dice1.getValue());
            }
        }
        return dice;
    }

    // each time it create a random number for dice n store it in value attr of Dice object
    private static void rollDice(Dice[] dice) {
        if(dice.length != 0) {
            for (int i = 0; i < dice.length; i++) {
                dice[i].roll();
            }
        }
    }

    public static Dice[] createDice(int numOfDice){
        Dice[] dice = new Dice[numOfDice];
        for(int i=0; i< dice.length; i++){
            dice[i] = new Dice();
        }
        return dice;
    }

    // Function to remove the dice
    public static Dice[] removeTheElement(Dice[] dice, int value)
    {
        if (dice == null || value < 0
                || value >= dice.length) {
            return dice;
        }

        // Create another array of size one less
        Dice[] anotherDice = new Dice[dice.length - 1];

        for (int i = 0, k = 0; i < dice.length; i++) {

            if (dice[i].getValue() == value) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherDice[k++] = dice[i];
        }

        // return the resultant array
        return anotherDice;
    }
}