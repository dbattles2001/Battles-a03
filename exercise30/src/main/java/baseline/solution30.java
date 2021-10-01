package baseline;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

//Solution 30

public class solution30 {
    public static void main(String[] args) {
        /*
            This one is super easy
            for i = number of columns
            for j = number of rows
            print i*j
         */

        for(int i = 1; i<13; i++){
            for(int j = 1; j<13; j++){
                if(i*j < 10){
                    System.out.printf(" ");
                }
                if(i*j < 100){
                    System.out.printf(" ");
                }
                System.out.printf("%d  ", i*j);
            }
            System.out.printf("\n");
        }
    }
}
