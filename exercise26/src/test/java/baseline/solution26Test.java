package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution26Test {
    @Test
    public void test_calculateMonthsUntilPaidOff(){
        solution26 d = new solution26();

        double i = 12;
        double b = 5000;
        double p = 100;

        assertEquals(d.calculateMonthsUntilPaidOff(i, b, p), 70);
    }
}