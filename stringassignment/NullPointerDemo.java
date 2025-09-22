public class NullPointerDemo {

    // Generate exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length());  // Causes NullPointerException
    }

    // Handle exception
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        //generateException(); // Uncomment to see abrupt termination
        handleException();
    }
}

