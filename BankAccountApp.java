// Custom Exception
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Account Class
class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidAmountException("Amount cannot be greater than balance.");
        }
        balance -= amount;
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Account account = new Account(1001, "Elmira", 500);

        try {
            account.withdraw(700);
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
