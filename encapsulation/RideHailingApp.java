import java.util.*;

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double r) { this.ratePerKm = r; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName + ", Vehicle: " + vehicleId + ", Rate/km: " + ratePerKm);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class CarRide extends RideVehicle implements GPS {
    private String location;

    public CarRide(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge
    }

    @Override
    public String getCurrentLocation() { return location == null ? "Unknown" : location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class BikeRide extends RideVehicle implements GPS {
    private String location;

    public BikeRide(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override public String getCurrentLocation() { return location == null ? "Unknown" : location; }
    @Override public void updateLocation(String newLocation) { this.location = newLocation; }
}

class AutoRide extends RideVehicle implements GPS {
    private String location;

    public AutoRide(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30;
    }

    @Override public String getCurrentLocation() { return location == null ? "Unknown" : location; }
    @Override public void updateLocation(String newLocation) { this.location = newLocation; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<RideVehicle> fleet = new ArrayList<>();
        CarRide cr = new CarRide("CAR001", "Arun", 15);
        BikeRide br = new BikeRide("BIKE001", "Deepa", 8);
        AutoRide ar = new AutoRide("AUTO001", "Munna", 10);

        cr.updateLocation("MG Road");
        br.updateLocation("Near Park");
        ar.updateLocation("Bus Stand");

        fleet.add(cr);
        fleet.add(br);
        fleet.add(ar);

        double distance = 12.5;
        for (RideVehicle v : fleet) {
            v.getVehicleDetails();
            System.out.println("Current location (if GPS): " + ((v instanceof GPS) ? ((GPS)v).getCurrentLocation() : "N/A"));
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println();
        }
    }
}
