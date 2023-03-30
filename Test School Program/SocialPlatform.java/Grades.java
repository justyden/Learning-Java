import java.util.*;

public class Grades {
    private String currentGrade;
    private float percentage;

    Grades(float inputPercentage) {
        Scanner userInput = new Scanner(System.in);

        while (!(inputPercentage >= 0 && inputPercentage <= 100)) {
            System.out.println("Please input a correct percentage.");
            inputPercentage = userInput.nextFloat();
        }

        percentage = inputPercentage;
    }

    private void calculateGrade(float inputPercentage) {
    }
}
