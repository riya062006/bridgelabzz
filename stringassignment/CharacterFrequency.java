import java.util.Scanner;

public class CharacterFrequency {

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

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int len = findLength(text);
        int[] freq = new int[256];

        // count frequencies
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        // count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark processed
            }
        }

        // create 2D array for characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // fill result array
        for (int i = 0; i < len; i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] < 0) {
                result[index][0] = String.valueOf(text.charAt(i));
                result[index][1] = String.valueOf(-freq[ascii]); // restore positive
                freq[ascii] = 0; // mark as added
                index++;
            }
        }

        return result;
    }

    // Method to display results
    public static void display(String[][] arr) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i][0] + "      |     " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        display(result);
    }
}
