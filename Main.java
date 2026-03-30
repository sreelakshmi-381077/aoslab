import java.util.Scanner;

// Step 1: User-defined Exception
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Step 2: Authentication Class
class UserAuthentication {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void authenticate(String username, String password) 
            throws InvalidCredentialsException {

        if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        } else {
            System.out.println("Authentication successful!");
        }
    }
}

// Step 3: Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            UserAuthentication.authenticate(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}