import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Info", "New appointment scheduled."),
            new Alert("Warning", "Medication missed.")
        );

        Predicate<Alert> showOnlyCritical = a -> a.type.equalsIgnoreCase("Critical");

        System.out.println("Filtered Alerts (Critical only):");
        alerts.stream()
              .filter(showOnlyCritical)
              .forEach(System.out::println);
    }
}

