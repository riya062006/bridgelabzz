class Fruit {
    public String name;
    public Fruit(String name) { this.name = name; }
    public String toString() { return name; }
}

class Apple extends Fruit {
    public Apple() { super("Apple"); }
}

class Mango extends Fruit {
    public Mango() { super("Mango"); }
}

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (T f : fruits)
            System.out.println(f);
    }

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.displayFruits();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.addFruit(new Mango());
        mangoBox.displayFruits();

        // ❌ The following won't compile:
        // FruitBox<Car> carBox = new FruitBox<>(); // Error: Car is not a Fruit
    }
}

