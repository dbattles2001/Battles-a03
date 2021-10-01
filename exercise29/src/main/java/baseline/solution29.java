package baseline;
import java.util.Scanner;

public class solution29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solution29 d = new solution29();
        /*
            I'll have a conditionMet variable (which is basically just the thing
            i use to determine if you've entered a valid input or not)
            to end the loop once you've entered a correct input

            print "What's your rate?"
            rate = nextInt

            while(conditionMet != 1)
            if rate <= 0 || parseInt of rate is false
            this is incorrect
            else
            print the number of years
         */
        int conditionMet = 0;
        String years = "";
        int yearsAsAnInteger = 1;

        while(conditionMet != 1){
            System.out.println("Please enter a valid positive nonzero number of years.");
            years = input.next();

            try{
                yearsAsAnInteger = Integer.parseInt(years);

                if(yearsAsAnInteger < 1){
                    System.out.println("Nope, you've entered an incorrect number.");
                }else{
                    conditionMet = 1;
                }
            }catch(NumberFormatException e){
                System.out.println("Nope, you've entered an incorrect number.");
            }
        }

        int yearsItTakes = d.yearsItTakes(years);

        System.out.println("The years it'll take to double your investment are " + yearsItTakes);
    }
    public int yearsItTakes(String years){
        int yearsAsAnInteger = Integer.parseInt(years);
        int yearsItTakes = 72/yearsAsAnInteger;

        return yearsItTakes;
    }
}
