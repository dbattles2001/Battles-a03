package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution28Test {
    @Test
    public void test_makeTheSumOf(){
        solution28 d = new solution28();
        int[] array = {0, 1, 2, 3};

        assertEquals(d.makeTheSumOf(array), 6);
    }
}