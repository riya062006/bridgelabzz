interface VehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements VehicleRental {
    public void rent() { System.out.println("Car rented."); }
    public void returnVehicle() { System.out.println("Car returned."); }
}

class Bike implements VehicleRental {
    public void rent() { System.out.println("Bike rented."); }
    public void returnVehicle() { System.out.println("Bike returned."); }
}

public class vehicle {
    public static void main(String[] args) {
        VehicleRental v1 = new Car();
        VehicleRental v2 = new Bike();
        v1.rent();
        v1.returnVehicle();
        v2.rent();
        v2.returnVehicle();
    }
}
