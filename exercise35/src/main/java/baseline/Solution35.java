package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//Solution 35

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        /*
        Scan the name into an array over and over until the user enters a blank input

        when it determines a blank input has been entered, end the loop and decode a random name, then
        display that name as the winner
        */

        String[] array = new String[10];
        int condition = 0;
        int i = 0;

        while(condition == 0){
            System.out.println("Print a name (up to 10):");
            array[i] = input.nextLine();

            if(Objects.equals(array[i], "") || Objects.equals(array[i], " ")){
                condition = 1;
            }else{
                i++;
            }
        }

        int choice = rand.nextInt(i);

        System.out.println("The winner is " + array[choice]);
    }
}
