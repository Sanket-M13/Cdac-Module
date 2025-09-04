class BankAccount{
	private double balance;
	
	void deposite(double amt){
		this.balance += amt;
		System.out.println("Balance Deposite");
		System.out.println("Your Current balance is: "+ this.balance);
	}
	
	void withdraw(double amt){
		if(amt > balance){
			System.out.println("Not sufficient Balance");
		}else{
			this.balance -= amt;
			System.out.println("Withdrawl Successfull");
		}
	}
	
	void getBalance(){
		System.out.println("Your balance is: "+ this.balance);
	}
	
	public static void main(String args[]){
	
		BankAccount B1 = new BankAccount();
		B1.deposite(45500);
		B1.withdraw(25000);
		B1.getBalance();
		
		
	}
	
	
	
}