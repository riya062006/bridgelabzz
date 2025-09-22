import java.util.Scanner;

public class three {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int min = number1, max = number1;
        if(number2 < min) min = number2;
        if(number3 < min) min = number3;
        if(number2 > max) max = number2;
        if(number3 > max) max = number3;
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        sc.close();
    }
}

