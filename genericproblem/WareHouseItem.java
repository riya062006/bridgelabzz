import java.util.*;

abstract class WarehouseItem {
    private String name;
    WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}

class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }

    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.getName());
    }

    public List<T> getItems() { return items; }

    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.addItem(new Electronics("Laptop"));
        eStore.addItem(new Electronics("Smartphone"));

        Storage<Furniture> fStore = new Storage<>();
        fStore.addItem(new Furniture("Sofa"));
        fStore.addItem(new Furniture("Table"));

        System.out.println("All Electronics:");
        displayAll(eStore.getItems());
        System.out.println("All Furniture:");
        displayAll(fStore.getItems());
    }
}

