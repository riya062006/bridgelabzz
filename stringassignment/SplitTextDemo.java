import java.util.Scanner;

public class SplitTextDemo {
    // Method to find length without length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to split words manually
    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 1; // at least 1 word
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[wordIndex] = temp;
        return words;
    }

    // Compare string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("User-defined split:");
        for (String w : userSplit) System.out.println(w);

        System.out.println("\nBuilt-in split:");
        for (String w : builtInSplit) System.out.println(w);

        System.out.println("\nAre both splits equal? " + compareArrays(userSplit, builtInSplit));
    }
}
