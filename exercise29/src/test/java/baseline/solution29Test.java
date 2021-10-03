package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void test_yearsItTakes(){
        Solution29 d = new Solution29();

        String years = "72";

        assertEquals(1, d.yearsItTakes(years));
    }

}