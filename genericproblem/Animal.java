import java.util.*;

class Animal {
    void speak() { System.out.println("Animal speaking..."); }
}

class Dog extends Animal {
    void speak() { System.out.println("Dog barking..."); }
}

class Cat extends Animal {
    void speak() { System.out.println("Cat meowing..."); }
}

class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        printAnimals(dogs);
        printAnimals(cats);
    }
}
