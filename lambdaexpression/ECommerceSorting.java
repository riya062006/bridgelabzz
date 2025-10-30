import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " [Price: " + price + ", Rating: " + rating + ", Discount: " + discount + "%]";
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 60000, 4.5, 10),
            new Product("Laptop", 80000, 4.8, 15),
            new Product("Headphones", 2000, 4.2, 25)
        );

        System.out.println("Sorted by Price:");
        products.stream()
                .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        System.out.println("\nSorted by Rating:");
        products.stream()
                .sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);

        System.out.println("\nSorted by Discount:");
        products.stream()
                .sorted((p1, p2) -> Double.compare(p2.discount, p1.discount))
                .forEach(System.out::println);
    }
}
