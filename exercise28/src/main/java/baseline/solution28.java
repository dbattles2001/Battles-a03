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
        int numbersTotal;
        int sum = 0;

        System.out.println("How many numbers would you like?");
        numbersTotal = input.nextInt();

        sum = d.makeDaNumber(numbersTotal);

        System.out.println("Your total is " + sum);
    }
    public int makeDaNumber(int numbersTotal){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<numbersTotal; i++){
            System.out.println("Which number would you like?");
            sum += input.nextInt();
        }
        return sum;
    }

}
