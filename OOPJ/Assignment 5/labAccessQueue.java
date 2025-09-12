import java.util.*;
class labAccessQueue{
	public static void main(String args[]){
		
		 Queue<String> labQueue = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student enqueue");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.println("Enter the name");
			String name = sc.nextLine();
			labQueue.add(name);
		} 
		
		System.out.print("Enter number of students to dequeue: ");
        int dequeueCount = sc.nextInt();

        for (int i = 0; i < dequeueCount; i++) {
            if (!labQueue.isEmpty()) {
                System.out.println("Processing student: " + labQueue.poll());
            } else {
                System.out.println("Queue is empty! No more students to process.");
                break;
            }
        }
		System.out.println("Remaining Queue: " + labQueue);
		
	}
}