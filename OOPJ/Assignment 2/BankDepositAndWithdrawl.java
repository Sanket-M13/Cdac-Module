class BankDepositAndWithdrawl{
    String accountHolder;
    double balance;

    BankDepositAndWithdrawl(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance for " + accountHolder);
        }
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankDepositAndWithdrawl acc1 = new BankDepositAndWithdrawl("Rohit", 10000);
        BankDepositAndWithdrawl acc2 = new BankDepositAndWithdrawl("Sneha", 5000);

        acc1.deposit(2000);
        acc2.withdraw(1000);

        acc1.showDetails();
        acc2.showDetails();
    }
}
