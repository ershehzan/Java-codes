//Implement a class Bank Account to manage bank accounts. 
//The class should have attributes like account number, account holder's name, 
//balance, and methods for depositing, withdrawing, and displaying the account balance.
class BankAccount {
   
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "Alice Smith", 1000.0);

        myAccount.displayBalance();
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.displayBalance();
    }
}
