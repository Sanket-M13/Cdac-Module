import java.util.*;

class PrintJobQueueManager{
	public static void main(String args[]){
		Queue<String> Jobs = new ArrayDeque<>();
		
		Jobs.add("Doc1");
		Jobs.add("Doc2");
		Jobs.add("Doc3");
		
		System.out.println("Jobs: "+Jobs);
		
		System.out.println("Process "+ Jobs.poll());
		System.out.println("Queue: "+Jobs);
	}
}