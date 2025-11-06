interface SensitiveData {}  // Marker Interface

class BankDetails implements SensitiveData {
    String accountNumber = "XXXX-1234";
}

public class market {
    public static void main(String[] args) {
        BankDetails bd = new BankDetails();
        if (bd instanceof SensitiveData)
            System.out.println("Encrypting sensitive data before saving...");
        else
            System.out.println("No encryption required.");
    }
}
