import java.util.function.Predicate;

public class temperature {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = t -> t > 35.0;

        double temp = 37.5;
        if (isHighTemp.test(temp))
            System.out.println("⚠️ Alert: High temperature detected (" + temp + "°C)");
        else
            System.out.println("Temperature normal (" + temp + "°C)");
    }
}
