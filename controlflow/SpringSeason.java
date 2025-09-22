import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (number): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
