package baseline;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//(Solution 28)

public class Solution28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution28 d = new Solution28();
        /*
            how many numbers would you like to add up?
            int n = nextInt

            int[] numberArray

            for n
            insert number [i]
            numberArray[i] = nextInt

            int sum

            for n
            sum += numberArray[i]

            total is sum
         */
        int numbersTotal = 0;
        int sum;
        int conditionMet = 0;
        int[] array = new int[10];

        while(conditionMet == 0){
            System.out.println("How many numbers would you like to add? (max 10)");
            numbersTotal = input.nextInt();

            if(numbersTotal > 10){
                System.out.println("I said less than 10.");
            }else{
                conditionMet = 1;
            }
        }
        for(int i = 0; i<numbersTotal; i++){
            System.out.println("Which number would you like?");
            array[i] = input.nextInt();
        }

         sum = d.makeTheSumOf(array);

        System.out.println("Your sum is " + sum);
    }
    public int makeTheSumOf(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        return sum;
    }
}
