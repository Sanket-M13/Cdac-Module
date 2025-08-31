class Passenger{
	
	String name;
	int age;
	String seatType;
	
	static int Totalticket;
	
	Passenger(String name, int age){
		this.name = name;
		this.age = age;
		
		seatType = "General";
		
		Totalticket++;
	}
	
	Passenger(String name, int age , String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		
		Totalticket++;
	}
	
	void getter(){
		System.out.println("Name: "+ name + " Age: "+ age + " Seat: "+ seatType);
	}
	
	static void TotalPassenger(){
		System.out.println("Total Passengers Booked: "+ Totalticket);
	}
	
	public static void main(String args[]){
		Passenger p1 = new Passenger("Ravi", 25);
		Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
		Passenger p3 = new Passenger("Suresh", 40);
		
		p1.getter();
		p2.getter();
		p3.getter();
		
		TotalPassenger();
			
			
	}
}