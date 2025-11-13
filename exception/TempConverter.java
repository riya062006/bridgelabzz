class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) { super(msg); }
}

public class TempConverter {
    public static void convert(double temp, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67))
            throw new InvalidTemperatureException("Temperature below absolute zero!");

        if (unit == 'C')
            System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
        else if (unit == 'F')
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
        else
            System.out.println("Invalid unit!");
    }

    public static void main(String[] args) {
        try {
            convert(-500, 'F');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
