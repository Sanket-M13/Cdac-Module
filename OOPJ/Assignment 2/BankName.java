class BankName {
    String accountHolder;
    double balance;

   
    static String bankName = "CDAC Bank";

    BankName(String accountHolder, double balance) {
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

    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
        displayBankName();
        BankName acc1 = new BankName("Amit", 8000);

        acc1.showDetails();
    }
}
