// src/test/java/Q2PrintArrayTest.java

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class Q2PrintArrayTest {

    @Test
    // 25 points
    public void testPrintArray() {
        assertEquals("1,2,3,4,5,6,7", Q2PrintArray.printRecursion(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals("10,20,30", Q2PrintArray.printRecursion(new int[]{10, 20, 30}));
        assertEquals("", Q2PrintArray.printRecursion(new int[]{}));
    }
}