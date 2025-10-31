public class sensor {
    public static void logData(Double data) {
        System.out.println("Logged (Wrapper): " + data);
    }

    public static void logData(double data) {
        System.out.println("Logged (Primitive): " + data);
    }

    public static void main(String[] args) {
        double temp1 = 36.6;
        Double temp2 = 38.2;

        logData(temp1); // primitive
        logData(temp2); // wrapper
    }
}
