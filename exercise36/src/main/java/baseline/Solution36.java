package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//Solution 36

public class Solution36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution36 d = new Solution36();

        /*
            Prompt the user for the number of numbers they want to find the averages of

            for that number, collect input to an array

            use all the numbers in the array for the four functions and print them
         */

        int condition = 0;
        int[] numberArray = new int[20];
        String number;
        int correct = 0;
        int size = 0;

        System.out.println("Welcome to the math machine, enter at least 3 numbers please.");

        while(condition == 0){
            System.out.println("Enter a number:");
            number = input.next();

            if(!number.equalsIgnoreCase("done")) {
                try{
                    Integer.parseInt(number);
                    correct = 1;
                } catch(NumberFormatException e){
                    System.out.println("Sorry, you entered an incorrect input.");
                }
            }

            if(number.equalsIgnoreCase("done")){
                condition = 1;
            } else if (correct == 1){
                size++;
                numberArray[size] = Integer.parseInt(number);
                correct = 0;
            }
        }

        if(size < 3){
            System.out.println("You've not entered enough numbers, task failing.");
            System.exit(0);
        } else{
            System.out.printf("Numbers are: ");
            for(int i = 1; i < size+1; i++){
                System.out.printf("%d ", numberArray[i]);
            }
        }
        System.out.printf("%n");

        double average = d.getAverage(numberArray, size);
        System.out.println("Average is " + average);

        int minimum = d.getMinimum(numberArray, size);
        System.out.println("Lowest number is " + minimum);

        int maximum = d.getMaximum(numberArray, size);
        System.out.println("Max number is " + maximum);

        double standardDeviation = d.calculateStandardDeviation(numberArray, size);
        System.out.println("Standard deviation is " + standardDeviation);
    }

    public double getAverage(int[] array, int size){
        /* Average function
            average function will take input from the number of numbers they chose to enter,
            which will be the denominator for that size, += the array into itself, then divide it by that number
            print that number
        */
        double sum = 0;
        double average = 0;

        for(int i = 1; i< size+1; i++){
            sum += array[i];
        }

        average = sum / size;

        return average;
    }

    /* max and min
        max and min will be two separate but very similar functions that will test themselves in a loop to find
        the highest and lowest values respectively.

        for example
        lowestNumber = array[0]

        for(denominator from before)
        if array[i] < lowestNumber
        lowestNumber = array[i]
     */

    public int getMinimum(int[] array, int size){
        int lowestNumber = 1000000000;
        for(int i = 1; i<size+1; i++){
            if(array[i] < lowestNumber){
                lowestNumber = array[i];
            }
        }

        return lowestNumber;
    }
    public int getMaximum(int[] array, int size){
        int maxNumber = -100;
        for(int i = 1; i<size+1; i++){
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }
        }

        return maxNumber;
    }

    /* standard deviation
        I don't remember the shorthand for the standard deviation formula, but i'll use it here.
     */
    public double calculateStandardDeviation(int[] array, int size){
        double sum = 0;
        double standardDeviation = 0;

        for(int i = 1; i<size+1; i++){
            sum += array[i];
        }

        double mean = sum / size;

        for(int i = 1; i<size+1; i++){
            standardDeviation += Math.pow(array[i] - mean, 2);
        }

        return Math.sqrt(standardDeviation / size);
    }
}
