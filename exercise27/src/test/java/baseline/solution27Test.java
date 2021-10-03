package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    void test_validateInput(){
        Solution27 d = new Solution27();

        String firstName = "d";
        String lastName = "d";
        String zipCode = "d";
        String employeeID = "d";

        assertEquals(3, d.validateInput(firstName, lastName, zipCode, employeeID));
    }
}