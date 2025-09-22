import java.util.Scanner;

public class StringLengthDemo {
    // Method to calculate length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  // will throw exception when count >= actual length
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int userLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
