import java.util.*;
class DailyTaskTracker{
	public static void main(String args[]){
		List<String> task = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of task: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i< n; i++){
			System.out.print("Enter task: ");
			String tasks = sc.nextLine();
			task.add(tasks);
		}
		
		System.out.print("Enter the Completed Tast:");
		String toRemove = sc.nextLine();
		task.remove(toRemove);
		System.out.println("Task removed");
		
		System.out.print("Remaining task"+ task);
		
		
	}
}