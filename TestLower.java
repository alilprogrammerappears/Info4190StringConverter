import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLower {
    
    @Test
    public void testConvertLowercase() {
        // Given
        String input = "HELLO";
        ConvertLower converter = new ConvertLower();

        // When
        String result = converter.convertLowercase(input);

        // Then
        assertEquals("hello", result);
    }

}
