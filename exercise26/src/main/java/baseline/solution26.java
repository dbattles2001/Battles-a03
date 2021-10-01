package baseline;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Dustin Battles
 */

//(Solution 26)

public class solution26 extends PaymentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solution26 d = new solution26();
        double i;
        double b;
        double p;

        //scan in each variable asking the respective questions (balance, rate, etc)

        System.out.println("What is your balance?");
        b = input.nextDouble();
        System.out.println("What is the APR on the card? (As a percent)");
        i = input.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        p = input.nextDouble();

        double months = d.calculateMonthsUntilPaidOff(i, b, p);

        System.out.printf("It will take you %.0f months to pay this card off.", months);
    }
}
