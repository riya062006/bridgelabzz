import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Riya", "Neha", "Ankit"};
        //generateException(names);
        handleException(names);
    }
}

