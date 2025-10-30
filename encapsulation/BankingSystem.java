
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance; // protected for subclass access if needed

    public BankAccount(String accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.holderName = holder;
        this.balance = balance;
    }

    // encapsulation
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds or invalid amount");
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100.0;
    }

    @Override
    public boolean applyForLoan(double amount) {
        // simple rule: must have balance >= 10% of requested amount
        return balance >= amount * 0.1;
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5; // simple eligibility formula
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accNo, String holder, double balance, double overdraftLimit) {
        super(accNo, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // typically no interest for current account (simple model)
    }

    public double getOverdraftLimit() { return overdraftLimit; }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SB1001", "Riya", 50000, 4.0));
        accounts.add(new CurrentAccount("CA2001", "Aman", 20000, 50000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " - Balance: " + acc.getBalance() + ", Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility() + ", Can apply for 1L: " + l.applyForLoan(100000));
            }
            System.out.println();
        }
    }
}
