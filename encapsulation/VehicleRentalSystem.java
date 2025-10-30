// File: VehicleRentalSystem.java
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rate) { this.rentalRate = rate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println(type + " [" + vehicleNumber + "] Rate/day: " + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double insurancePremium;

    public Car(String num, double rate, double insurancePremium) {
        super(num, "Car", rate);
        this.insurancePremium = insurancePremium;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insurancePremium;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance policy premium: " + insurancePremium;
    }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.6; // cheaper multiplier
    }
}

class Truck extends Vehicle implements Insurable {
    private double insurancePremium;

    public Truck(String num, double rate, double insurancePremium) {
        super(num, "Truck", rate);
        this.insurancePremium = insurancePremium;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // higher cost
    }

    @Override
    public double calculateInsurance() {
        return insurancePremium;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance policy premium: " + insurancePremium;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA01AB1234", 3000, 2500));
        vehicles.add(new Bike("KA01BB2222", 800, 0));
        vehicles.add(new Truck("KA01CC9999", 7000, 8000));

        int days = 3;
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println(ins.getInsuranceDetails() + ", Insurance Cost: " + ins.calculateInsurance());
            }
            System.out.println();
        }
    }
}
