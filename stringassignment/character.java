import java.util.Scanner;

public class character{

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // index goes out of range
        }
        return count;
    }

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int len = findLength(text);
        int[] freq = new int[256]; // frequency array

        // count frequencies
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        // check first non-repeating
        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // no non-repeating character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}
