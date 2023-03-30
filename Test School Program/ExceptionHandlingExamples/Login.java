package ExceptionHandlingExamples;

public class Login {
    private int MaxUserLength = 10;
    private int MinUserLength = 6;
    private int MaxPasswordLength = 8;
    private int MinPasswordLength = 5;

    public String LogInUser(String userName, String password) throws InvalidUserException, BadPasswordException {
        String token = userName + " " + password;

        if (userName.length() < MinUserLength) {
            throw new InvalidUserException(String.format("The user id must be at least %d", MinUserLength));
        }

        if (userName.length() > MaxUserLength) {
            throw new InvalidUserException(String.format("The user id me be less than %d", MaxUserLength));
        }

        if ((password.length() < MinPasswordLength) || (password.length() > MaxPasswordLength)) {
            throw new BadPasswordException("Password is not the correct length.");
        }

        return token;
    }
}
