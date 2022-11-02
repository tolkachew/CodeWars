package kyu8.ReturnNegative;

import static org.junit.jupiter.api.Assertions.assertEquals;

import kyu8.ReturnNegative.ReturnNegative;
import org.junit.jupiter.api.Test;

class ReturnNegativeTest {
    private ReturnNegative Test;

    @Test
    void sample() {
        assertEquals(-42, ReturnNegative.makeNegative(42));
        assertEquals(-5, ReturnNegative.makeNegative(5));
        assertEquals(0, ReturnNegative.makeNegative(0));
    }
}
