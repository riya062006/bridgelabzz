import java.util.*;

public class ages {
    public static void main(String[] args) {
        int[] ages = {25, 32, 40, 29, 55};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) list.add(age); // auto-boxing

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Employee Ages: " + list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}

