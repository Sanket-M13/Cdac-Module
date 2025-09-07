interface Payment{
	void pay(double amount);
}

class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount){
		System.out.println("Processing Credit car payment of "+ amount);
	}
}

class PaypalPayment implements Payment{
	@Override
	public void pay(double amount){
		System.out.println("Processing PayPal Payment of "+ amount);
	}
}

class PaymentGateway{
	public static void main(String args[]){
		CreditCardPayment cp = new CreditCardPayment();
		cp.pay(2500);
		
		PaypalPayment pp = new PaypalPayment();
		pp.pay(1500);
	}
}