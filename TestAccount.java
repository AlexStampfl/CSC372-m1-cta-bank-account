public class TestAccount {
    public static void main(String[] args){
        // Create a bank account object
        // BankAccount account1 = new BankAccount("First Name: John", "Last Name: Doe", 12345);
        // System.out.println("~~~~~~~~ BankAccount Example ~~~~~~~~~~~~");
        // account1.deposit(200);
        // account1.withdrawal(50);
        // account1.accountSummary();

        // System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("Jane", "Smith", 54321, 1.5);

        System.out.println("~~~~~~~~ CheckingAccount Example ~~~~~~~~~~~");
        
        checkingAccount.deposit(100);
        checkingAccount.withdrawal(150);
        checkingAccount.processWithdrawal(150);
        checkingAccount.displayAccount();
    }
}
