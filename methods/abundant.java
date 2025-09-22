public class abundant {
    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) arr[idx++] = i;
        return arr;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static boolean isPerfect(int n) { return sum(factors(n)) == n; }
    public static boolean isAbundant(int n) { return sum(factors(n)) > n; }
    public static boolean isDeficient(int n) { return sum(factors(n)) < n; }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        for (int d : String.valueOf(n).chars().map(c -> c - '0').toArray()) sum += factorial(d);
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println("Is Perfect: " + isPerfect(n));
        System.out.println("Is Abundant: " + isAbundant(n));
        System.out.println("Is Deficient: " + isDeficient(n));
        System.out.println("Is Strong: " + isStrong(n));
    }
}
