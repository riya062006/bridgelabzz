import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when index goes out of range
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] temp = new char[len];  // store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check if this char appeared earlier
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, store in temp
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // create new array with only uniqueCount elements
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Display result
    public static void display(char[] arr) {
        System.out.print("Unique Characters: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);
        display(uniqueChars);
    }
}

