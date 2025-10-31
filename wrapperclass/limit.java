public class limit {
    public static double remainingLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println("Limit1: " + remainingLimit(limit1));
        System.out.println("Limit2: " + remainingLimit(limit2));
    }
}
