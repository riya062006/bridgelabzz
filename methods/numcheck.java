import java.util.Scanner;

public class numcheck {
    
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (isPositive(n)) {
                System.out.println(n + " is Positive");
                if (isEven(n)) System.out.println(n + " is Even");
                else System.out.println(n + " is Odd");
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int cmp = compare(arr[0], arr[4]);
        if (cmp == 1) System.out.println("First element > Last element");
        else if (cmp == 0) System.out.println("First element = Last element");
        else System.out.println("First element < Last element");

        sc.close();
    }
}

