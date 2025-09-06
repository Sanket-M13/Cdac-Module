class Account{
	int accountNo;
	int balance;
	
	Account(int a, int b){
	this.accountNo = a;
	this.balance = b;
	}
}

class Saving extends Account{
	double interest;
	Saving(int a, int b, double rate){
		super(a,b);
		this.interest = rate;
	}
	
	void display(){
		System.out.println("Saving: "+ accountNo+" Balance: "+ balance+ " Interest = "+interest+ "%" );
	}
}

class CurrentAccount extends Account{
	int overdraft;
	CurrentAccount(int a, int b, int over){
		super(a,b);
		this.overdraft = over;
	}
	
	void display(){
		System.out.println("Current: "+ accountNo+" Balance: "+ balance+ " Overdraft = "+overdraft+"%");
	}
}

class BankAccTypes{
	public static void main(String args[]){
		Saving sv = new Saving(101, 5000, 5);
		
		sv.display();
		
		CurrentAccount CA = new CurrentAccount(102, 10000, 2000);
		
		CA.display();
	}
}
