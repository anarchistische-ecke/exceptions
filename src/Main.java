import java.util.Arrays;
import java.util.Locale;

public class Main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";

    public static void main(String[] args) {

        try {
            loggingIn("Odmin", "sup", "sup");
            System.out.println("Login successful!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Login failed!");
            e.printStackTrace();
        }
    }


    public static void loggingIn(String login, String password, String confirmPassword) {
            if (!login.matches(REGEX)) {
                throw new WrongLoginException();
            }
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            if (!password.matches(REGEX)) {
                throw new WrongPasswordException();
            }
            if (password.length() > 20) {
                throw new WrongPasswordException();
            }
        }
    }


