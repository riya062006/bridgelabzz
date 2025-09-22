import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        //generateException(text);
        handleException(text);
    }
}
