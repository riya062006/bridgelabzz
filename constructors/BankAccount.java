class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int acc, String holder, double bal) {
        accountNumber = acc;
        accountHolder = holder;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int acc, String holder, double bal) {
        super(acc, holder, bal);
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Riya", 10000);
        s.display();
        s.deposit(5000);
        System.out.println("Balance: " + s.getBalance());
    }
}
