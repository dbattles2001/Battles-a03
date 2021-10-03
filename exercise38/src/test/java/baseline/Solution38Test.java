package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void test_filterEvenNumbers() {
        Solution38 d = new Solution38();
        int[] expectedArray = {2, 2, 4, 6, 8, 10, 0, 0, 0, 0};
        int[] inputArray = {2, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(expectedArray, d.filterEvenNumbers(inputArray));
    }
}