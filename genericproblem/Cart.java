import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T i : items) {
            System.out.println(i);
        }
    }
}

class Electronics {
    public String toString() { return "Electronics Item"; }
}

class Clothing {
    public String toString() { return "Clothing Item"; }
}

class MainCart {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());
        eCart.addItem(new Electronics());
        System.out.println("Electronics Cart:");
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());
        System.out.println("Clothing Cart:");
        cCart.displayItems();
    }
}
