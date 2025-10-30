import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("riya", "arjun", "neha");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperNames);
    }
}

