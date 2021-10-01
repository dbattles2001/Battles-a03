package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution31Test {
    @Test
    public void test_calculateTargetHeartRate(){
        solution31 d = new solution31();

        assertEquals(d.calculateTargetHeartRate(20, 70, 1), 136);
    }

}