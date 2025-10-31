public class Comparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b : " + (a == b));
        System.out.println("c == d : " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));

        System.out.println("\nExplanation:");
        System.out.println("For integers between -128 and 127, Java caches values → a==b is true.");
        System.out.println("For 200, new objects are created → c==d is false.");
    }
}

