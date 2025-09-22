import java.util.Scanner;

public class calculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();
        System.out.printf("Wind chill: %.2f\n", calculateWindChill(temp, windSpeed));
        sc.close();
    }
}
