package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//(Solution 24)

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution24 d = new Solution24();

        //I accidentally deleted all of my skeleton code, so here it is again

        //prompt the user for input

        System.out.println("What would you like your first word to be?");
        String firstWord = input.next();

        System.out.println("Ok, and how about your second?");
        String secondWord = input.next();

        //call the anagramChecker
        //its boolean so we're just gonna call it in an if statement

        if (d.anagramChecker(firstWord, secondWord)) {
            System.out.println("These two are anagrams.");
        } else {
            System.out.println("These two definitely aren't anagrams.");
        }
    }
    public boolean anagramChecker(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }

        String s1 = firstWord.replaceAll("\\s", "");
        String s2 = secondWord.replaceAll("\\s", "");

        char[] arrayOne = s1.toLowerCase().toCharArray();
        char[] arrayTwo = s2.toLowerCase().toCharArray();
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        return Arrays.equals(arrayOne, arrayTwo);
    }
}
