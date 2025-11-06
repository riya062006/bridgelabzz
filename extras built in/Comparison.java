import java.time.LocalDate;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else {
            System.out.println(date1 + " is the same as " + date2);
        }
        sc.close();
    }
}

