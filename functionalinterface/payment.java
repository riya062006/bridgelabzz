interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}

public class payment {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        upi.pay(500);
        card.pay(1200);
    }
}
