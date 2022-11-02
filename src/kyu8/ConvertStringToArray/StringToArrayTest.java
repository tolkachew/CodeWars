package kyu8.ConvertStringToArray;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class StringToArrayTest {
    public StringToArray Test;

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Test.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Test.stringToArray("I love arrays they are my favorite"));
    }
}
