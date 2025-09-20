// Step 1: Create Custom Exception
class InsufficientBalanceException extends Exception {  // Checked Exception
    public InsufficientBalanceException(String message) {
        super(message); // Pass message to parent Exception class
    }
}

// Step 2: Bank Class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // Throw custom exception
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

// Step 3: Main class to test
public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(7000); // This will throw custom exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Transaction complete.");
    }
}
