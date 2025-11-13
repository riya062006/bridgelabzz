import java.util.*;

class CopyListExample {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1, 2, 3);

        copyList(numbers, ints);
        System.out.println("Copied List: " + numbers);
    }
}
