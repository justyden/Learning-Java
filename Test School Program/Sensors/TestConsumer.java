package Sensors;

public class TestConsumer {
    public static String isEvenNumber(int value) {
        String numberValue = value % 2 == 0 ? "Even" : "False";
        return numberValue;
    }
}
