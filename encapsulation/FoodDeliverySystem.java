import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " @ " + price);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; } // 5% discount
    @Override
    public String getDiscountDetails() { return "5% veg discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 20; // extra packaging charge per item

    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.03; } // 3% discount
    @Override
    public String getDiscountDetails() { return "3% non-veg discount + ₹" + nonVegCharge + " extra per item"; }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 220, 2));
        order.add(new NonVegItem("Chicken Biryani", 320, 1));

        double grandTotal = 0;
        for (FoodItem f : order) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            double discount = (f instanceof Discountable) ? ((Discountable)f).applyDiscount() : 0;
            System.out.println("Total: " + total + ", Discount: " + discount + ", Payable: " + (total - discount));
            grandTotal += (total - discount);
            System.out.println();
        }
        System.out.println("Order Grand Total: " + grandTotal);
    }
}

