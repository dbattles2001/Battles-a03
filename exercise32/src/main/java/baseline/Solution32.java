package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//Solution 32

import java.util.Scanner;
import java.util.Random;

public class Solution32 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        /*
            print out "lets play the number guessing game!
            What difficulty would you like? LVL 1, 2, or 3?"
        */

        System.out.println("Let's play the number guessing game!");
        System.out.println("What difficulty would you like? 1, 2, or 3? (3 is SUPER hard)");

        /*
            Have them insert an option between those numbers here,
            making sure its a number, and also one of those three options
        */

        int condition = 0;
        int difficultyInt = 0;
        String difficulty;
        int correct = 0;

        while(condition == 0){
            System.out.println("Please choose a difficulty.");
            difficulty = input.next();

            try{
                Integer.parseInt(difficulty);
                correct = 1;
            }catch(NumberFormatException e){
                System.out.println("Enter a correct choice.");
                correct = 0;
            }

            if(correct == 1){
                difficultyInt = Integer.parseInt(difficulty);

                if(difficultyInt > 3 || difficultyInt < 1){
                    System.out.println("Enter a correct choice.");
                } else{
                    condition = 1;
                }
            }
        }

        /*
            After a choice is made, randomize a number according to the difficulty and
            have them guess. Each time they make a guess, the number of guesses goes up
            by one (unless they enter a non numeric value for a guess.)

            It will scan their choice (assuming its numeric) and scan it against
            the randomly generated number, telling them whether or not its larger
            or smaller, or whether or not they've guessed it.

            Once they guessed it it'll end and ask if they want to play again,
            to which we'll scan a y or n and restart, because all of this is in a
            while choice !=n loop.
         */

        int guesses = 0;
        condition = 0;
        int upperBound = 0;

        switch(difficultyInt){
            case 1 -> upperBound = 10;
            case 2 -> upperBound = 100;
            case 3 -> upperBound = 1000;
            default -> System.out.println("Welp.");
        }

        int randomNumber = rand.nextInt(upperBound) + 1;
        String guess;
        int guessInt = 0;

        while(condition == 0) {
            System.out.println("Go ahead and guess!");
            guess = input.next();

            try {
                Integer.parseInt(guess);
                correct = 1;
            } catch (NumberFormatException e) {
                System.out.println("Wrong guess!");
                correct = 0;
            }

            if (correct == 1) {
                guessInt = Integer.parseInt(guess);
            }
            if (guessInt > randomNumber) {
                System.out.println("Lower!");
            }else if(guessInt < randomNumber) {
                System.out.println("Higher!");
            }else {
                System.out.println("Nice, you got it in " + (guesses + 1) + " guesses!");
                condition = 1;
            }

            guesses += 1;
        }
    }
}
