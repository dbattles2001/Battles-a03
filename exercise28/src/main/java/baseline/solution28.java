package baseline;
import java.util.Scanner;

public class solution28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solution28 d = new solution28();
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
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }
}
