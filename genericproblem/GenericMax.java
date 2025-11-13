class GenericMax {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Integer: " + maximum(3, 7, 5));
        System.out.println("Max Double: " + maximum(5.5, 2.3, 9.9));
        System.out.println("Max String: " + maximum("apple", "banana", "pear"));
    }
}

