import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void input_1_shouldReturn_I(){
        String  expected    = "I";
        String  actual;
        int     given       = 1;

        RomanNumerals romanNumerals = new RomanNumerals();
        actual = romanNumerals.convert(given);

        assertEquals(expected, actual);
    }
}