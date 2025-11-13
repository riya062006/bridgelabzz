import java.util.*;

class Vehicle {
    private String name;
    Vehicle(String name) { this.name = name; }
    public String getName() { return name; }
}

class Truck extends Vehicle {
    Truck(String name) { super(name); }
}

class Bike extends Vehicle {
    Bike(String name) { super(name); }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }
}
