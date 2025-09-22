public class sort {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};

        int start = 0, end = 0, high = arr.length - 1;

        while (end <= high) {
            switch (arr[end]) {
                case 0: {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end++;
                    break;
                }
                case 1: {
                    end++;
                    break;
                }
                case 2: {
                    int temp = arr[end];
                    arr[end] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

