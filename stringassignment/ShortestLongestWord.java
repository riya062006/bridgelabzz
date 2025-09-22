import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[] findShortestLongest(String[][] table) {
        String shortest = table[0][0], longest = table[0][0];
        int min = Integer.parseInt(table[0][1]), max = min;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                shortest = table[i][0];
            }
            if (len > max) {
                max = len;
                longest = table[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = wordsWithLengths(words);

        String[] result = findShortestLongest(table);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
