package kyu8.SumArray;

class SumArray1 {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static double arr[] = {};
    static double sum() {
        double sum = 0;
        for (double i = 0; i < arr.length; i++)
            sum += arr[(int) i];
        return sum;
    }
}