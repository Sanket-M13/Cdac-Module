class TicketBook{
	String passengerName;
	int ticketNo;
	
	static int counter = 5000;
	
	TicketBook(String name){
		this.passengerName = name;
		counter++;
		
		this.ticketNo = counter;	
	}
	
	
	void displayTicket(){
		System.out.println("Ticket No: "+ this.ticketNo + ", Passenger: "+ this.passengerName);
	}
	
	public static void main(String args[]){
		TicketBook ticket1 = new TicketBook("Rahul");
		TicketBook ticket2 = new TicketBook("Priya");
		TicketBook ticket3 = new TicketBook("Amit");
		
		ticket1.displayTicket();
		ticket2.displayTicket();
		ticket3.displayTicket();
		
	}
}