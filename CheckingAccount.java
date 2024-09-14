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
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to indicate fee has been accessed
    public void processWithdrawal(double amount){
        if (amount > getBalance()){
            // apply overdraft fee & calculate new balance
            double overdraftFee = 30.0;
            double newBalance = getBalance() - (amount + overdraftFee);
            setBalance(newBalance); //update actual balance

            // display new negative balance and denote that a few has been applied
            System.out.printf("Overdraft! A $30 fee has been charged. New balance: $%.2f%n", newBalance); 
            System.out.println("Overdraft fee applied.");
        } else {
            // if no overdraft, just perform normal withdrawal
            withdrawal(amount);
        }
    }

    // Display all superclass attributes + interest rate
    public void displayAccount(){
        super.accountSummary(); // call superclass method
        System.out.printf("Interest Rate: %.2f%%", interestRate);
    }
}
