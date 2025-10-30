
import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    // encapsulation
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount(); // percentage or fixed discount
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountPercent;

    public Electronics(int id, String name, double price, double discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercent / 100.0;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

class Clothing extends Product implements Taxable {
    private double discountFlat;

    public Clothing(int id, String name, double price, double discountFlat) {
        super(id, name, price);
        this.discountFlat = discountFlat;
    }

    @Override
    public double calculateDiscount() {
        return discountFlat;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }

    @Override
    public String getTaxDetails() {
        return "GST 12%";
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0; // assume no discount
    }
}

public class ECommercePlatform {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        double finalPrice = price + tax - discount;
        System.out.println(p.getName() + " -> Price: " + price + ", Tax: " + tax + ", Discount: " + discount + ", Final: " + finalPrice);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Smartphone", 30000, 10));
        products.add(new Clothing(201, "T-Shirt", 799, 100));
        products.add(new Groceries(301, "Rice 5kg", 450));

        for (Product p : products) printFinalPrice(p);
    }
}

