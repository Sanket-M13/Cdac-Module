abstract class Payment{
	abstract void pay();
}

class CreditCardPayment extends Payment{
	String cardNumber;
	double amount;
	
	CreditCardPayment(String cardNo, double amount){
		this.cardNumber = cardNo;
		this.amount = amount;
	}
	
	@Override
	void pay(){
	
		System.out.println("Pay via Credit card "+ cardNumber + "Rs."+amount+" Paid");	
	}
}

class UPIPayment extends Payment{
	String upiId;
	double amount;
	
	UPIPayment(String Id, double amount){
		this.upiId = Id;
		this.amount = amount;
	}
	
	@Override
	void pay(){
		System.out.println("Pay via UPI "+ upiId + "Rs."+amount+" Paid");	
	}
}

class PaymentSystem{
	public static void main(String args[]){
		CreditCardPayment c = new CreditCardPayment("1234567890123456",5000);
		c.pay();
		
		UPIPayment upi = new UPIPayment("UPI rahul@upi",2000);
		upi.pay();
	}
}