public class TestAccount {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount("Jane", "Smith", 54321, 1.5);
        System.out.println("~~~~~~~~ CheckingAccount Example ~~~~~~~~~~~");
        checkingAccount.deposit(150);
        checkingAccount.withdrawal(25);
        checkingAccount.processWithdrawal(150);
        checkingAccount.displayAccount();
    }
}
