import java.util.*;

class TicketBookingQueue{
	public static void main(String args[]){
		Queue<String> Service = new ArrayDeque<>();
		
		Service.add("Amit");
		Service.add("Priya");
		Service.add("Rohan");
		
		
		System.out.println("Serving the first customer "+ Service.poll());
		System.out.println("Remaining Queue: "+Service);
	}
}