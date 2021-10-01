package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution29Test {
    @Test
    public void test_yearsItTakes(){
        solution29 d = new solution29();

        String years = "72";

        assertEquals(d.yearsItTakes(years), 1);
    }

}