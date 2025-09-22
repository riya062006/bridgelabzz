import java.util.Random;

public class heights {
    public static int sum(int[] arr) {
        int total = 0;
        for (int h : arr) total += h;
        return total;
    }

    public static double mean(int[] arr) {
        return sum(arr) * 1.0 / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
