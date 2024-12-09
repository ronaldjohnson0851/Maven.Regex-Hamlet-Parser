import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String changeWord = hamletParser.changeHamletToLeon();
        assertEquals(true, changeWord.contains("Leon"));
    }

    @Test
    public void testChangeHoratioToTariq() {
        String changeWord = hamletParser.changeHoratioToTariq();
        assertFalse(changeWord.contains("Horatio"));
        assertTrue(changeWord.contains("Tariq"));
    }

    @Test
    public void testFindHoratio() {
        assertTrue(hamletText.contains("Horatio"));
    }

    @Test
    public void testFindHamlet() {
        assertTrue(hamletText.contains("Hamlet"));

    }
}