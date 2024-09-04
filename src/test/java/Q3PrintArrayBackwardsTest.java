// src/test/java/Q3PrintArrayBackwardsTest.java

import org.junit.Test;
import static org.junit.Assert.*;

public class Q3PrintArrayBackwardsTest {

    @Test
    @Score(25) // 25 points
    public void testPrintArrayBackwards() {
        assertEquals("7,6,5,4,3,2,1", Q3PrintArrayBackwards.printRecursionBackwards(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals("30,20,10", Q3PrintArrayBackwards.printRecursionBackwards(new int[]{10, 20, 30}));
        assertEquals("", Q3PrintArrayBackwards.printRecursionBackwards(new int[]{}));
    }
}