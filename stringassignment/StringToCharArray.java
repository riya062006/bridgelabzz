import java.util.Scanner;

public class StringToCharArray {
    // User-defined method
    public static char[] toCharArrayManual(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userChars = toCharArrayManual(text);
        char[] builtInChars = text.toCharArray();

        System.out.println("Arrays are equal? " + compareArrays(userChars, builtInChars));
    }
}

