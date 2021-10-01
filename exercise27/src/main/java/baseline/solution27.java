package baseline;
import java.util.Scanner;

public class solution27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solution27 d = new solution27();

        /*
            Have the user enter input according to questions
            FN? LN? ID? ZIP?

            validateInput(FN LN ID ZIP){
                validate FNLN
                validate ZIP
                validate ID
         */

        System.out.println("What is your first name?");
        String firstName = input.next();
        System.out.println("What is your last name?");
        String lastName = input.next();
        System.out.println("What is your ZIP code?");
        String zip = input.next();
        System.out.println("What is your employee ID? (XX-9999 format)");
        String employeeID = input.next();

        int numberOfErrors = d.validateInput(firstName, lastName, zip, employeeID);
    }
    public int validateInput(String firstName, String lastName, String zip, String employeeID){
        int errors = 0;
        solution27 d = new solution27();

        /*
            Just to explain; the errors bit is purely for testing. each time it gets a type of error
            (names count as 1 together) it increments.
         */

        boolean namesTrue = d.validateNames(firstName, lastName);
        if(!namesTrue){
            errors++;
        }

        boolean zipTrue = d.validateZIP(zip);
        if(!zipTrue){
            errors++;
        }

        boolean employeeIDTrue = d.validateEmployeeID(employeeID);
        if(!employeeIDTrue){
            errors++;
        }

        return errors;
    }
    private boolean validateNames(String firstName, String lastName){
        String[] stringArray = new String[2];
        stringArray[0] = firstName;
        stringArray[1] = lastName;
        boolean firstNameError = false;

        for(int i = 0; i<2; i++){
            if(stringArray[i] == "" || stringArray[i].length() < 2){
                if(i == 0){
                    System.out.println("You've entered an incorrect first name.");
                    firstNameError = true;
                }else{
                    System.out.println("You've entered an incorrect last name.");
                    return false;
                }
            }
        }
        if(firstNameError == true){
            return false;
        }else{
            return true;
        }
    }
    private boolean validateZIP(String zip){
        if(!zip.matches("\\d{5}")){
            System.out.println("You've entered an incorrect zip code.");
            return false;
        }else{
            return true;
        }
    }
    private boolean validateEmployeeID(String employeeID){
        if(!employeeID.matches("^[A-Z]{2}[-][0-9]{4}")){
            System.out.println("You've entered an incorrect employeeID.");
            return false;
        }else{
            return true;
        }
    }
}
