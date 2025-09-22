public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid indices
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
    }

    public static void main(String[] args) {
        String text = "HelloWorld";
        //generateException(text);
        handleException(text);
    }
}
