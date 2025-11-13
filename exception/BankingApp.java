import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String msg) { super(msg); } }
class InsufficientFundsException extends Exception { public InsufficientFundsException(String msg) { super(msg); } }
class NetworkFailureException extends Exception { public NetworkFailureException(String msg) { super(msg); } }

class Transaction {
    public void performTransaction() throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0 -> throw new NegativeAmountException("Negative amount not allowed!");
            case 1 -> throw new InsufficientFundsException("Insufficient funds!");
            case 2 -> throw new NetworkFailureException("Network connection failed!");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.performTransaction();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

