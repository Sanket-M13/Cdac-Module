class Customer{
	String name;
	String ticketType;
	
	static int totalTicket;
	
	Customer(String name){
		this.name = name;
		ticketType = "Normal";
		
		totalTicket++;
	}
	
	Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		totalTicket++;
	}
	
	void getter(){
		System.out.println("Name: "+ name + " Ticket: "+ ticketType);
	}
	
	static void Totalticket(){
		System.out.println("Total Ticket sold: "+ totalTicket);
	}
	
	public static void main(String args[]){
		Customer t1 = new Customer("Rahul");
		Customer t2 = new Customer("pooja","Premium");
		Customer t3 = new Customer("Amit");
		
		t1.getter();
		t2.getter();
		t3.getter();
		
		Totalticket();		
	}
}