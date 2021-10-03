package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    void test_anagramChecker(){
        Solution24 d = new Solution24();

        String one = "hello";
        String two = "goodbye";

        assertFalse(d.anagramChecker(one, two));
    }

}