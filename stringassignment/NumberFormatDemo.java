public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // not a number
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        String text = "abc123";
        //generateException(text);
        handleException(text);
    }
}
