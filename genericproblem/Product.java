import java.util.*;

class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }
}

class Mobile extends Product {
    public Mobile(double price) { super(price); }
}

class Laptop extends Product {
    public Laptop(double price) { super(price); }
}

class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(15000), new Mobile(25000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(70000));

        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}
