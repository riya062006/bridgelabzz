import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double value: ");
        double a = input.nextDouble();
        System.out.print("Enter second double value: ");
        double b = input.nextDouble();
        System.out.print("Enter third double value: ");
        double c = input.nextDouble();
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        input.close();
    }
}
