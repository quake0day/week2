// src/test/java/Q4ReverseStringTest.java

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(ScoreCalculator.class)

public class Q4ReverseStringTest {

    @Test
    @Score(25) // 25 points
    public void testReverseString() {
        assertEquals("gnirts tset", Q4ReverseString.reverse("test string"));
        assertEquals("avaj", Q4ReverseString.reverse("java"));
        assertEquals("", Q4ReverseString.reverse(""));
        assertEquals("a", Q4ReverseString.reverse("a"));
    }
}