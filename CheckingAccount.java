public class CheckingAccount extends BankAccount{
    private double interestRate;

    // Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID); // call the superclass constructor
        this.interestRate = interestRate; // set interestRate
    }

    // Override the withdrawal method to include overdraft and fee
    @Override
    public void withdrawal(double amount){
        if (amount > 0 && amount <= getBalance()){
            // Regular withdrawal if sufficient balance
            super.withdrawal(amount);
        } else if (amount > getBalance()){
            // Overdraft case
            double overdraftfee = 30.0;

            double newBalance = getBalance() - (amount + overdraftfee);
            setBalance(newBalance);
            
            System.out.println("Overdraft! A $30 fee has been charged.");
            System.out.printf("New balance: $%.2f%n", newBalance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to indicate fee has been accessed
    public void processWithdrawal(double amount){
        if (amount > getBalance()){
            System.out.println("Overdraft fee applied.");
        }
    }

    // Display all superclass attributes + interest rate
    public void displayAccount(){
        super.accountSummary(); // call superclass method
        System.out.printf("Interest Rate: %.2f%%", interestRate);
    }
}
