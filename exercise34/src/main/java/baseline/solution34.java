package baseline;

import java.util.Scanner;

public class solution34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Enters in with a few random names i'll create printed out like this:

            Dustin Battles
            Aaron Carter
            Jeff Bezos
            Drake Josh

            These names are in an array.

            print "Which one would you like to remove?"

            Have them enter a name and test that name first to see if
            its non numeric, then for(names) see which name it is, then remove it. This
            will also change the number of employees which will be determined on opening,
            which is relevant to the second half of the assignment.
         */
        int no = 0;
        int removeChoice = 0;
        int removed = 0;

        String[] nameArray = {"Dustin Battles", "Dwayne Carter", "Antonio Brown", "Bob Evans"};

        while(no == 0) {
            for (int i = 0; i < nameArray.length; i++) {
                if(nameArray[i] != "") {
                    System.out.println(nameArray[i]);
                }
            }

            System.out.println("Would you like to remove any of the employee's names? Please enter one (no) or zero (yes)");
            no = input.nextInt();

            if(no == 0) {
                System.out.println("Alright, which one would you like to remove? Choose a corresponding name 0 - " + nameArray.length);
                removeChoice = input.nextInt();
            }

            for(int i = 0; i<nameArray.length; i++){
                if(i == removeChoice){
                    nameArray[i] = "";
                    removed++;
                }
            }

            if(removed > nameArray.length){
                no = 1;
            }
        }
    }
}
