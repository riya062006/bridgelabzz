import java.util.Arrays;

public class palrevcheck {
    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

    public static boolean isPalindrome(int n) {
        int[] arr = digitsArray(n);
        return arraysEqual(arr, reverseArray(arr));
    }

    public static boolean isDuckNumber(int n) {
        int[] arr = digitsArray(n);
        for (int d : arr) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Is Palindrome: " + isPalindrome(n));
        System.out.println("Is Duck: " + isDuckNumber(n));
    }
}
