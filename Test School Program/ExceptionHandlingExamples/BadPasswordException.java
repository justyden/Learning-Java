package ExceptionHandlingExamples;

public class BadPasswordException extends Exception {
    BadPasswordException(String message) {
        super(message);
    }
}
