import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of park: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of park: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of park: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3, 5000); // 5 km = 5000 meters
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds.");
    }
}

