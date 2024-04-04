import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLower {
    
    @Test
    public void testConvertLowercase() {

        String input = "HELLO";
        ConvertLower converter = new ConvertLower();

        String result = converter.convertLowercase(input);

        assertEquals("hello", result);
    }

}
