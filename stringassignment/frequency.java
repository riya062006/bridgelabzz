import java.util.Scanner;

public class frequency {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    // Method to find unique characters in the string
    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if already present
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // add if unique
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // create new array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int len = findLength(text);
        int[] freq = new int[256]; // ASCII based frequency

        // count frequencies
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        // get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // prepare 2D array: char + frequency
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
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

