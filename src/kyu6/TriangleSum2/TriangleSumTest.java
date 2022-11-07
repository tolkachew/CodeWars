package kyu6.TriangleSum2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;

@DisplayName("All test cases")
class TriangleSumTest {
    @Test
    @DisplayName("Small tests")
    void test0() {
        assertEquals(1, TriangleSumTest.getSum(0));
        assertEquals(-5, TriangleSumTest.getSum(1));
        assertEquals(10, TriangleSumTest.getSum(2));
        assertEquals(-18, TriangleSumTest.getSum(3));
    }
    @Test
    @DisplayName("Medium tests")
    void test1() {
        assertEquals(10251, TriangleSumTest.getSum(100));
        assertEquals(251251, TriangleSumTest.getSum(500));
        assertEquals(1002501, TriangleSumTest.getSum(1000));
    }

    @Test
    @DisplayName("Large tests")
    void test2() {
        assertEquals(100025001, TriangleSumTest.getSum(10000));
        assertEquals(10000250001L, TriangleSumTest.getSum(100000));
        assertEquals(1000002500001L, TriangleSumTest.getSum(1000000));
    }

    @Test
    @DisplayName("Random tests 500x")
    void test3() {
        Random r = new Random();
        for(int i = 0; i < 500; i++){
            int n = r.nextInt(1000000);
            assertEquals(getSum(n), TriangleSumTest.getSum(n));
        }
    }

    public static long getSum(int n){
        if(n==0)return 1;
        int m = 2*((n-1)/2);
        n = 2*(n/2);
        return (n*(n*((long)n*4+21)+32)-m*(m*((long)m*4+33)+86)-60)/12;
    }
}