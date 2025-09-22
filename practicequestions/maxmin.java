public class maxmin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, -2};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum Element = " + max);
        System.out.println("Minimum Element = " + min);
    }
}
