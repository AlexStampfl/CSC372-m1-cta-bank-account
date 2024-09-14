// superclass
public class BankAccount {
    private double balance;
    private String firstName;
    private String lastName;
    private int accountID;

    // constructor
    public BankAccount(String firstName, String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0; // Initialize balance to zero
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }
    public void withdrawal(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    // getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // print account info & balance
    public void accountSummary(){
        System.out.printf("Account information: %s %s, Account ID: %d%n", firstName, lastName, accountID);
        System.out.printf("Current balance: $%.2f%n", balance);
    }
    // main method
    public static void main(String[] args){
        System.out.println("This is the BankAccount class.");
    }
}