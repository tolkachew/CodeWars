package kyu8.SumPositive;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Arrays;

public class SumOfPositiveTest {

    @Test
    public void testSomething() {
        assertEquals(15, SumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumOfPositive.sum(new int[]{-1,2,3,4,-5}));
    }

    private int random(int min, int max) {
        return min+(int)(Math.random()*(max-min));
    }

    private int[] randomArray() {
        int randomSize = random(10, 5000);
        int[] arr = new int[randomSize];
        for(int i=0;i<randomSize;i++) {
            arr[i] = random(-100, 100);
        }
        return arr;
    }

    private int sum(int[] arr){
        return Arrays.stream(arr).filter(elt->elt>0).reduce(0,(a,b)->a+b);
    }

    @Test
    public void randomArrayTest(){
        for(int i=0;i<100;i++){
            int[] arr = randomArray();
            assertEquals(sum(arr), SumOfPositive.sum(arr));
        }
    }

}
