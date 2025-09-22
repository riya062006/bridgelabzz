import java.util.Scanner;

public class WordsWithLengths {
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

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int wi = 0;
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wi++] = temp;
                temp = "";
            } else temp += text.charAt(i);
        }
        words[wi] = temp;
        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordsWithLengths(words);

        System.out.println("\nWord\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
