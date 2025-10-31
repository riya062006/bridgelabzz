import java.util.*;

public class primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Primitive → Wrapper
        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper (Integer) object: " + obj);
        sc.close();
    }
}
