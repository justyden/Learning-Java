import java.util.Scanner;

public class CheckAge {

    public static void Age(int inputAge) {
        int age = inputAge;
        Scanner input = new Scanner(System.in);

        System.out.println("Input an age.");
        age = input.nextInt();
        input.close();

        if (age >= 65) {
            System.out.println("Senior citizen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen");
        } else if (age > 0) {
            System.out.println("Child");
        } else {
            System.out.println("Invalid");

        }
    }
}
