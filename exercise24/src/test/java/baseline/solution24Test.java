package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution24Test {
    @Test
    public void test_anagramChecker(){
        solution24 d = new solution24();

        String one = "hello";
        String two = "goodbye";

        assertFalse(d.anagramChecker(one, two));
    }

}