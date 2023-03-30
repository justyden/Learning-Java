import java.math.*;

public class Count {
    public static void CountUp(int inputStart, int inputEnd) {
        for (int i = inputStart; i <= inputEnd; i++) {
            System.out.println(i);
        }
    }

    public static void CountDown(int inputStart, int inputEnd) {
        for (int i = inputStart; i >= inputEnd; i--) {
            System.out.println(i);
        }
    }

    public static int SumOfArray(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

    public static double AverageOfArray(int[] inputArray) {
        double total = SumOfArray(inputArray);
        return total / inputArray.length;
    }

    public static double StandardDeviation(int[] inputArray) {
        double average = AverageOfArray(inputArray);
        double total = 0;
        for (int i = 0; i < inputArray.length; i++) {
            total += (Math.pow((average - inputArray[i]), 2));
        }

        return Math.sqrt(total);
    }
}
