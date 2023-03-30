package ExceptionHandlingExamples;

import java.util.*;

public class ExceptionCatching {

    public void createExceptionEvent() throws InvalidUserException, BadPasswordException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a user name: ");
            String userName = input.nextLine();
            System.out.println("Enter a password");
            String passWord = input.nextLine();
            Login login = new Login();
            login.LogInUser(userName, passWord);

        } catch (InvalidUserException e) {
            e.printStackTrace();

        } catch (BadPasswordException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Resource clean up.");
            input.close();
        }
    }
}
