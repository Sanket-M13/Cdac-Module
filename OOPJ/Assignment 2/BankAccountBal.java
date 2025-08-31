class BankAccountBal{
    String accountHolder;
    double balance;

    BankAccountBal(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccountBal acc = new BankAccountBal("Rohit", 10000);
        acc.showDetails();
    }
}
