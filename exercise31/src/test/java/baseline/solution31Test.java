package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void test_calculateTargetHeartRate(){
        Solution31 d = new Solution31();

        assertEquals(136, d.calculateTargetHeartRate(20, 70, 1));
    }
}