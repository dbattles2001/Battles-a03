package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution27Test {
    @Test
    public void test_validateInput(){
        solution27 d = new solution27();

        String firstName = "d";
        String lastName = "d";
        String zipCode = "d";
        String employeeID = "d";

        assertEquals(d.validateInput(firstName, lastName, zipCode, employeeID), 3);
    }
}