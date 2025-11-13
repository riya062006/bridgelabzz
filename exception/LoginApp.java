class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class Login {
    private final String validUser = "Riya";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass))
            throw new InvalidCredentialsException("Invalid username or password!");
    }
}

public class LoginApp {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.validate("Riya", "4321");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again!");
        }
    }
}
