// Custom Unchecked Exception
class InsufficientFundsException extends RuntimeException {
    private final double amountNeeded;

    public InsufficientFundsException(double amountNeeded) {
        super("Transaction failed! You need $" + amountNeeded + " more.");
        this.amountNeeded = amountNeeded;
    }

    public double getAmountNeeded() {
        return amountNeeded;
    }
}

// Usage
class BankAccount {
    private double balance = 100.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
    }
}

public class CustomExceptionBasic {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(150.0);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
            System.out.println("Shortfall amount: $" + e.getAmountNeeded());
        }
    }
}