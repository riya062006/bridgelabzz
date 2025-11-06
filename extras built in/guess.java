import java.util.*;

public class guess {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100!");
        int low = 1, high = 100;
        String feedback = "";

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("high"))
                high = guess - 1;
            else if (feedback.equalsIgnoreCase("low"))
                low = guess + 1;
            else if (feedback.equalsIgnoreCase("correct"))
                System.out.println("Yay! I guessed it!");
            else
                System.out.println("Invalid input, try again.");
        }
    }

    static int generateGuess(int low, int high) {
        return low + rand.nextInt(high - low + 1);
    }
}
