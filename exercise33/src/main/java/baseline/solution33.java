package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//Solution 33

import java.util.Random;
import java.util.Scanner;

public class solution33 {
    public static void main(String[] args) {
        solution33 d = new solution33();
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        /*
            print "whats your question?"

            have them scan in a question

            random number

            switch statement based on the random number leading to a few random outputs
         */
        System.out.println("What is your question?");
        String question = input.next();

        int choice = rand.nextInt(5) + 1;

        switch (choice){
            case 1 -> System.out.println("Ask again later.");
            case 2 -> System.out.println("Yes.");
            case 3 -> System.out.println("The 8 ball is uncertain.");
            case 4 -> System.out.println("Absolutely not.");
            case 5 -> System.out.println("Perhaps.");
            case 6 -> System.out.println("Go where your heart guides you.");
            default -> System.out.println("WHOOPS, you broke the 8 ball lol");
        }
    }
}
