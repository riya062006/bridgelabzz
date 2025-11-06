import java.util.function.Function;

public class length {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();
        String message = "Hello Functional Interfaces!";
        System.out.println("Message length: " + getLength.apply(message));

        if (getLength.apply(message) > 25)
            System.out.println("Message exceeds character limit!");
        else
            System.out.println("Message length is fine.");
    }
}
