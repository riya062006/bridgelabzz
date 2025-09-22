import java.util.Arrays;

public class variousnumber {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static boolean isDuckNumber(int n) {
        int[] arr = digitsArray(n);
        for (int d : arr) if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] arr = digitsArray(n);
        int sum = 0;
        int power = arr.length;
        for (int d : arr) sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] largestAndSecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) { max2 = max1; max1 = n; }
            else if (n > max2) max2 = n;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestAndSecondSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) { min2 = min1; min1 = n; }
            else if (n < min2) min2 = n;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] arr = digitsArray(n);

        System.out.println("Digits: " + Arrays.toString(arr));
        System.out.println("Is Duck: " + isDuckNumber(n));
        System.out.println("Is Armstrong: " + isArmstrong(n));
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestAndSecondLargest(arr)));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(arr)));
    }
}
