class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Riya", 22);
        Person p2 = new Person(p1); // Copy
        p1.display();
        p2.display();
    }
}

