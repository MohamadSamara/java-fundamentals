/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private String getErrorIfFound(String fileName) {
        StringBuilder result = new StringBuilder();
        List<String> errors = App.readFileAndDiscoveredError(fileName);
        for (String error : errors) {
            result.append(error);
        }
        return result.toString();
    }

    @Test
    public void testNoErrors() {
        assertEquals("No errors found", getErrorIfFound("gatesTest1.js"));
    }

    @Test
    public void testOneError(){
        assertEquals("Line 20: Missing ;", getErrorIfFound("gatesTest2.js"));
    }

    @Test
    public void testFewErrors() {
        assertEquals("Line 5: Missing ;" +
                        "Line 11: Missing ;",
                getErrorIfFound("gatesTest3.js"));
    }

    @Test
    public void testManyErrors(){
        String expected = "Line 3: Missing ;"+
                "Line 5: Missing ;"  +
                "Line 11: Missing ;" +
                "Line 13: Missing ;" +
                "Line 15: Missing ;" +
                "Line 25: Missing ;" +
                "Line 29: Missing ;" +
                "Line 30: Missing ;";

        assertEquals(expected, getErrorIfFound("gatesTest4.js"));
    }

    @Test
    public void testEmptyFile() {
        assertEquals("Empty File", getErrorIfFound("gatesTest5.js"));
    }

}