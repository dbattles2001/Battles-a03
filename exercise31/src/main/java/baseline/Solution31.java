package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

//Solution 31

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution31 d = new Solution31();

        /*
            while(parseInt is false)
            have them enter a number until its a number (this is the scanner and checker bit)
            Do this for age and resting heart rate
        */

        int conditionMet = 0;
        String restingPulse = "";
        String age = "";
        int correct = 1;
        int restingPulseInt = 0;
        int ageInt = 0;

        while(conditionMet == 0){
            System.out.println("What is your resting heart rate?");
            restingPulse = input.next();

            try{
                Integer.parseInt(restingPulse);
                correct = 1;
            } catch(NumberFormatException e){
                System.out.println("This is not a correct heartrate.");
                correct = 0;
            }

            if(correct == 1){
                restingPulseInt = Integer.parseInt(restingPulse);
                conditionMet = 1;
            }
        }
        conditionMet = 0;
        while(conditionMet == 0){
            System.out.println("What is your age?");
            age = input.next();

            try{
                Integer.parseInt(age);
                correct = 1;
            } catch(NumberFormatException e){
                System.out.println("This is not a correct age.");
                correct = 0;
            }

            if(correct == 1){
                ageInt = Integer.parseInt(age);
                conditionMet = 1;
            }
        }

        //Afterwards print out those values as described
        System.out.println("\nResting Pulse: " + restingPulseInt + "          Age: " + ageInt);
        System.out.println("\nIntensity     | Rate     ");
        System.out.println("--------------|----------");

        int intensity = 55;
        double rate;

        /*
            begin a table using a loop where the loop prints rows of the table under
            "intensity | rate"
            "----------------"
            The loop of course uses the formula and before reiterating will += 5
            I'll have the printed percentage and percentage used in the formula be two
            different variables just for simplicities sake
         */

        for(int i = 0; i<9; i++){
            System.out.printf("%d%%           | ", (intensity + (i*5)));

            rate = d.calculateTargetHeartRate(ageInt, restingPulseInt, i);

            System.out.printf("%.0f bpm%n", rate);
        }
    }
    public double calculateTargetHeartRate(int age, int restingPulse, int i) {
        double newPercentage = (55 + (i*5))/100.0;

        double targetHeartRate = (((200 - age) - restingPulse) * newPercentage) + restingPulse;
        targetHeartRate = Math.round(targetHeartRate);

        return targetHeartRate;
    }
}
