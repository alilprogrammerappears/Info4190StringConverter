import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestUpper {
    
    @Test
    public void testConvertUppercase() {

        String input = "hello";
        ConvertUpper converter = new ConvertUpper();

        String result = converter.convertUppercase(input);

        assertEquals("HELLO", result);
    }

}

