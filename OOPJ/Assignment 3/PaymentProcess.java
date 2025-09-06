abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " Rs. " + (int)amount + " Paid");
    }
}

class PaymentProcess{
    public static void main(String[] args) {
        Payment p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();
		
        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}