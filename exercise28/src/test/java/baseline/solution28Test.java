package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void test_makeTheSumOf(){
        Solution28 d = new Solution28();
        int[] array = {0, 1, 2, 3};

        assertEquals(6, d.makeTheSumOf(array));
    }
}