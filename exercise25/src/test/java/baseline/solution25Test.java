package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution25Test {
    @Test
    public void test_passwordValidator(){
        solution25 d = new solution25();

        String password = "twentyOne21!";

        int expected_strengthCount = 4;
        int actual_strengthCount = d.passwordValidator(password);

        assertEquals(expected_strengthCount, actual_strengthCount);
    }

}