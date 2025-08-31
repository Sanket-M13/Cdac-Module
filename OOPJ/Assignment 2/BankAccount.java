class BankAccount{
	String name;
	double balance;
	static double interestRate;
	
	static {
        interestRate = 4.0; 
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }
	
	BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
	
	void setName(String name){
		this.name = name;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	
	String getName(){
		return name;
	}
	
	double getBalance(){
		return balance;
	}
	
	void showDetails(){
		System.out.println("Account: Name= "+ name +" Balance= "+ balance + " Interest rate= "+ interestRate+ "%");
			}
	
	public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohit", 5000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        acc1.showDetails();
        acc2.showDetails();
    }
	
	
	
}