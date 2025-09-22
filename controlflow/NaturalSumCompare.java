import java.util.Scanner;
public class NaturalSumCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Are both results equal? " + (sumLoop == sumFormula));
        } else {
            System.out.println(n + " is not a natural number.");
        }
        input.close();
    }
}
