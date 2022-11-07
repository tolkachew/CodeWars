package kyu6.TriangleSum2;

public class TriangleSum {
    public static long getSum(int n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += Math.pow(-1,i)*(2 * i + 1) * (i + 1);
        }
        return sum;
    }
}