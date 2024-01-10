public class Main {
    public static void main(String[] args) {
        // Create a basic account
        Account basicAccount = new Account("123456", 1000.0);

        // Deposit and withdraw from the basic account
        basicAccount.deposit(500.0);
        basicAccount.withdraw(200.0);

        System.out.println("\n----------------\n");

        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount("789012", 2000.0, 2.5);

        // Deposit, withdraw, and apply interest to the savings account
        savingsAccount.deposit(1000.0);
        savingsAccount.withdraw(300.0);
        savingsAccount.applyInterest();

        System.out.println("\n----------------\n");

        // Create a current account
        CurrentAccount currentAccount = new CurrentAccount("345678", 3000.0, 1000.0);

        // Deposit, withdraw, and use overdraft in the current account
        currentAccount.deposit(1500.0);
        currentAccount.withdraw(2000.0);
        currentAccount.withdraw(500.0); // Uses overdraft

        System.out.println("\n----------------\n");

        // Display final balances
        System.out.println("Final Balances:");
        System.out.println("Basic Account Balance: " + basicAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
