package kyu7.TriangleSum1;

public class TriangleSum {
    public static long getSum(int n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += (2 * i + 1) * (i + 1);
        }
        return sum;
    }
}