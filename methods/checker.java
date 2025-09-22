public class checker {
    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        for (int d : digitsArray(sq)) sum += d;
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        for (int d : digitsArray(n)) { sum += d; prod *= d; }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || String.valueOf(n).endsWith("7");
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Is Prime: " + isPrime(n));
        System.out.println("Is Neon: " + isNeon(n));
        System.out.println("Is Spy: " + isSpy(n));
        System.out.println("Is Automorphic: " + isAutomorphic(n));
        System.out.println("Is Buzz: " + isBuzz(n));
    }
}
