public class Wrap {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj;        // auto-unboxing
        int i = (int) dObj.doubleValue(); // casting

        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int: " + i);
    }
}
