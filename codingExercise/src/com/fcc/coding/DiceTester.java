package com.fcc.coding;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DiceTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dice to use");
        int numOfDice = sc.nextInt();
        System.out.println("Enter the number of Simulation");
        int simulations = sc.nextInt();
        Instant start = Instant.now();

        DiceSimulationGame diceSimulation = new DiceSimulationGame(numOfDice, simulations);
        diceSimulation.playGame();

        Instant end = Instant.now();
        System.out.println("Total simulation took "+(Duration.between(start, end).getSeconds()));
    }
}