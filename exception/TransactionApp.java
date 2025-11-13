class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String msg) { super(msg); }
}

class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) { super(msg); }
}

class BankTransaction {
    public void verifyAccount(int accNo) throws AccountNotFoundException {
        if (accNo != 101)
            throw new AccountNotFoundException("Account not found!");
    }

    public void processTransaction(double amount) throws InsufficientFundsException2 {
        if (amount > 5000)
            throw new InsufficientFundsException2("Not enough balance to process transaction!");
        System.out.println("Transaction successful of ₹" + amount);
    }

    public void executeTransaction(int accNo, double amt) throws Exception {
        verifyAccount(accNo);
        processTransaction(amt);
    }
}

public class TransactionApp {
    public static void main(String[] args) {
        BankTransaction bt = new BankTransaction();
        try {
            bt.executeTransaction(999, 1000);
        } catch (AccountNotFoundException e) {
            System.out.println("Account Error: " + e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println("Funds Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
