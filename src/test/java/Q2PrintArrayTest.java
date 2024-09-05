import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Q2PrintArrayTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintArray() {
        Q2PrintArray.main(new String[]{});
        String expectedOutput = "1\n2\n3\n4\n5\n6\n7\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}