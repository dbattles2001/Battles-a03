package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void test_passwordValidator(){
        Solution25 d = new Solution25();

        String password = "twentyOne21!";

        int expected_strengthCount = 4;
        int actual_strengthCount = d.passwordValidator(password);

        assertEquals(expected_strengthCount, actual_strengthCount);
    }

}