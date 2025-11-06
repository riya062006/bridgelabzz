class Product implements Cloneable {
    String name;
    Product(String name) { this.name = name; }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class clone {
    public static void main(String[] args) {
        try {
            Product p1 = new Product("Laptop");
            Product p2 = (Product) p1.clone();
            System.out.println("Cloned product: " + p2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
