package SumArray;

public class SumArray {
    public static double sum(double[] numbers) {
        double el= 0;
        for(double ele : numbers){
            el+=ele;
        }
        return el;
    }
}