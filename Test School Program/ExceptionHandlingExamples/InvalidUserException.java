package ExceptionHandlingExamples;

public class InvalidUserException extends Exception {
    InvalidUserException(String message) {
        super(message);
    }
}
