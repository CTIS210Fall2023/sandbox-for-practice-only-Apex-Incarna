package edu.guilford;

import java.util.Random;

public class RandomProgramThatJustTakesALotOfYourTime {
    public static void main(String[] args) {
        Random rand = new Random();
        
        double randomInt = rand.nextInt();

        long counter = 0;

        while (randomInt != 1) {
            randomInt = rand.nextInt();
            // squaredInt = randomInt*randomInt;
            counter ++;
        }
        

        System.out.println("The 'random' value is: " + (int) randomInt);

        System.out.println("And it only took " + counter + " tries!");
    }
}