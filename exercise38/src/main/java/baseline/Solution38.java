package baseline;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Solution38 d = new Solution38();

        /*
            for 10 times, prompt the user for a number, saving the numbers to an array

            print them with spaces

            pass that array to the filterEvenNumbers function
         */

        int[] array = new int[10];
        for(int i = 0; i<10; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            array[i] = input.nextInt();
        }

        int[] evenArray = d.filterEvenNumbers(array);

        System.out.printf("The even numbers are: ");
        for(int i = 0; i< evenArray.length; i++){
            if(evenArray[i] > 0){
                System.out.printf("%d ", evenArray[i]);
            }
        }
    }
    public int[] filterEvenNumbers(int[] array){
        /* filterEvenNumbers(the number array)
        for(size of the number array)
            if array[i] % 2 > 0
                evenArray[count] = array[i]
                count++
         */
        int[] evenArray = new int[10];
        int count = 0;

        for(int i = 0; i< array.length; i++){
            if(array[i] % 2 == 0){
                evenArray[count] = array[i];
                count++;
            }
        }

        return evenArray;
    }
}
