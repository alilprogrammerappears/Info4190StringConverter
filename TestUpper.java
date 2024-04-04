import static org.junit.Assert.assertEquals;

import org.junit.Test;

//this file tests the convert upper feature
public class TestUpper {
    
    @Test
    public void testConvertUppercase() {

        String input = "hello";
        ConvertUpper converter = new ConvertUpper();

        String result = converter.convertUppercase(input);

        assertEquals("HELLO", result);
    }

}

