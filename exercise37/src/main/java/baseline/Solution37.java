package baseline;

import java.util.Scanner;
import java.util.Random;

public class Solution37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        /*
            I think maybe the easiest way to do this one is first

            Ask the user how many numbers they want at least, save
        */

        System.out.println("How many characters would you like?");
        int characters = input.nextInt();

        //Ask them how many special characters, save

        System.out.println("Out of the " + characters + " how many would you want to be special?");
        int specialCharacters = input.nextInt();

        //Ask them how many numbers, save

        int numbers = 0;
        if(characters - specialCharacters > 0){
            System.out.println("How many numbers would you like?");
            numbers = input.nextInt();
        }

        /*
            do a couple of for loops that go like this -
            for(number of special characters)
            password[i] = random special character from list i'll predetermine.
            numberHolder++

            for number of numbers + numberHolder
            passwordLength[i] = random number.
            numberHolder++

            for remainder of passwordLength
            insert random letters

            password is then scrambled and printed out.
         */

        char[] password = new char[characters];

        String specialCharacterList = "!@#$%^&*()";
        String allNumbers = "0123456789";
        String allLetters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";

        //fills in special characters
        for(int i = 0; i<specialCharacters; i++){
            password[i] = specialCharacterList.charAt(rand.nextInt(10));
        }

        //fills in numbers
        for(int i = specialCharacters; i<characters; i++){
            password[i] = allNumbers.charAt(rand.nextInt(10));
        }

        //fills in the rest with letters
        for(int i = (specialCharacters + numbers); i<characters; i++){
            password[i] = allLetters.charAt(rand.nextInt(52));
        }


        System.out.printf("Your password is: ");
        for(int i = 0; i< characters; i++){
            System.out.printf("%c", password[i]);
        }
    }
}
