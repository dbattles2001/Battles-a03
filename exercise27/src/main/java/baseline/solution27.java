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

        d.validateInput(firstName, lastName, zip, employeeID);
    }
    public void validateInput(String firstName, String lastName, String zip, String employeeID){
        solution27 d = new solution27();

        d.validateNames(firstName, lastName);

        d.validateZIP(zip);

        d.validateEmployeeID(employeeID);
    }
    private void validateNames(String firstName, String lastName){
        String[] stringArray = new String[2];
        stringArray[0] = firstName;
        stringArray[1] = lastName;

        for(int i = 0; i<2; i++){
            if(stringArray[i] == "" || stringArray[i].length() < 2){
                if(i == 0){
                    System.out.println("You've entered an incorrect first name.");
                }else{
                    System.out.println("You've entered an incorrect last name.");
                }
            }
        }
    }
    private void validateZIP(String zip){
        try{
            int n = Integer.parseInt(zip);
        }catch(NumberFormatException e){
            System.out.println("You've entered an incorrect ZIP code.");
        }

        if(zip.length() != 5){
            System.out.println("You've entered an incorrect ZIP code.");
        }
    }
    private void validateEmployeeID(String employeeID){
        if(!Character.isLetter(employeeID.charAt(0)) || !Character.isLetter(employeeID.charAt(1))){
            System.out.println("You've entered an incorrect employee ID.");
            return;
        }
        if(employeeID.charAt(2) != '-'){
            System.out.println("You've entered an incorrect ID.");
            return;
        }
        for(int i = 3; i<7; i++){
            if(!Character.isDigit(employeeID.charAt(i))){
                System.out.println("You've entered an incorrect ID.");
            }
        }
    }
}
