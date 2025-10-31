class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + name);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Riya", 5000);
        Customer c2 = new Customer("Amit", 7000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}

