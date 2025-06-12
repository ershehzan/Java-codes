// Implement a class BankAccount to manage bank accounts.
// The class should have attributes like account number, account holder's name,
// balance, and methods for depositing, withdrawing, and displaying the account balance.

class BankAccount {

    // Private fields for account number, account holder's name, and balance
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the BankAccount object with values
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    // Method to deposit a positive amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
   
    // Method to withdraw a positive amount if sufficient balance is available
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
    // Method to display account details and current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "Alice Smith", 1000.0); // Create a new account

        myAccount.displayBalance();    // Show initial details
        myAccount.deposit(500);        // Deposit 500
        myAccount.withdraw(200);       // Withdraw 200
        myAccount.displayBalance();    // Show updated details
    }
}
