package baseline;

import org.junit.jupiter.api.Test;

import java.lang.invoke.SerializedLambda;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    public void test_getAverage(){
        Solution36 d = new Solution36();

        //If you're reading this, the 0th array is 0 and is ignored in the
        //equation, which is why it's zero here.

        int[] array = {0, 1, 2, 3};
        int size = 3;

        assertEquals(2, d.getAverage(array, size));
    }

    @Test
    public void test_getMax(){
        Solution36 d = new Solution36();

        int[] array = {0, 1, 2, 3};
        int size = 3;

        assertEquals(3, d.getMaximum(array, size));
    }

    @Test
    public void test_getMin(){
        Solution36 d = new Solution36();

        int[] array = {0, 1, 2, 3};
        int size = 3;

        assertEquals(1, d.getMinimum(array, size));
    }

    @Test
    public void test_std(){
        Solution36 d = new Solution36();

        int[] array = {0, 1, 2, 3};
        int size = 3;

        assertEquals(0.816496, d.calculateStandardDeviation(array, size), 0.000001);
    }
}