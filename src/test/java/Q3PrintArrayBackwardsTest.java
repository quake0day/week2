import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Q3PrintArrayBackwardsTest {
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
    public void testPrintArrayBackwards() {
        Q3PrintArrayBackwards.main(new String[]{});
        String expectedOutput = "7\n6\n5\n4\n3\n2\n1\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}