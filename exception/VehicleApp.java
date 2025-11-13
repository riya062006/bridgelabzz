import java.time.LocalDate;

class ServiceOverdueException extends Exception { public ServiceOverdueException(String msg) { super(msg); } }
class InvalidMileageException extends Exception { public InvalidMileageException(String msg) { super(msg); } }

class Vehicle {
    LocalDate serviceDate;
    int mileage;

    public Vehicle(LocalDate date, int mileage) {
        this.serviceDate = date;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0)
            throw new InvalidMileageException("Invalid mileage reading!");
        if (serviceDate.isBefore(LocalDate.now()))
            throw new ServiceOverdueException("Service is overdue!");
        System.out.println("Vehicle is in good condition.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(LocalDate.of(2024, 5, 1), 12000);
        try {
            v.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Alert: " + e.getMessage());
        }
    }
}
