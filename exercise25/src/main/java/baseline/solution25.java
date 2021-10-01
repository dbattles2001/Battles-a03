package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//(Solution 25)

public class solution25 {
    public static void main(String[] args) {
        solution25 d = new solution25();
        Scanner input = new Scanner(System.in);
        String password;

        //Ask for the input
        System.out.println("What's your password?");

        password = input.next();

        int strengthCount = d.passwordValidator(password);

        //now that we have an assumed strengthCount, let's print out the results based on it.
        //"returns 0 1 2 3 4 for values of strength with 0 being the weakest"
        switch (strengthCount) {
            case 0 -> System.out.println("How did you even put in a password this bad?");
            case 1 -> System.out.println("Your password could be better.");
            case 2 -> System.out.println("Your password is OK.");
            case 3 -> System.out.println("Your password is strong.");
            case 4 -> System.out.println("Your password is PERFECT!");
            default -> System.out.println("Whoops.");
        }
    }
    public int passwordValidator(String password){
        int strengthCount = 0;

        //Length checker
        if(password.length() >= 8) {
            strengthCount++;
        }

        //parse the string and make sure the int is greater than 0 to detect it has numbers.
        int n = 0;
        int dontTry = 0;

        String numbersOnly = password.replaceAll("[^0-9]", "");
        try{
            n = Integer.parseInt(numbersOnly);
        }catch(NumberFormatException e){
            dontTry = 1;
        }

        if(dontTry != 1){
            n = Integer.parseInt(numbersOnly);
        }

        if(n > 0){
            strengthCount++;
        }

        //for a loop length of password's length, check each letter and see if they're letters
        //counting up each time it finds a letter. if that counted up variable
        //is greater than 0, than it has letters, so strengthCount++
        n = password.length();
        int howManyLetters = 0;
        for(int i = 0; i<n; i++) {
            if (Character.isAlphabetic(password.charAt(i))) {
                howManyLetters++;
            }
        }

        if(howManyLetters > 0) {
            strengthCount++;
        }

        //I almost forgot that it needs to have special characters too. So, let's do something similar to the way it detects
        //Numbers, but with special characters
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        for (int i=0; i < password.length() ; i++) {
            char ch = password.charAt(i);
            if (specialCharactersString.contains(Character.toString(ch))) {
                strengthCount++;
                break;
            }
        }

        return strengthCount;
    }
}
