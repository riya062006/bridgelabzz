import java.util.Scanner;

public class Max {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
