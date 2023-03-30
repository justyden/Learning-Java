package RecurrsionEamples;

public class Recurrsion {
    public int findFactorial(int number) {
        if (number == 1) {
            return 1;
        }

        int ret = number * findFactorial(number - 1);
        return ret;
    }
}
