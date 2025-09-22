public class kth {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int kthMin = arr[k - 1];
        int kthMax = arr[n - k];

        System.out.println("Kth Minimum Element = " + kthMin);
        System.out.println("Kth Maximum Element = " + kthMax);
    }
}
