package kyu8.ReversedStrings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
        assertEquals("avaJ", ReversedStrings.solution("Java"));
    }
}
