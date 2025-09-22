import java.util.Scanner;

public class recursion {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (>0).");
        } else {
            int sumRec = recursiveSum(n);
            int sumFormula = formulaSum(n);

            System.out.println("Recursive Sum: " + sumRec);
            System.out.println("Formula Sum: " + sumFormula);
            System.out.println("Both results are equal: " + (sumRec == sumFormula));
        }
        sc.close();
    }
}

