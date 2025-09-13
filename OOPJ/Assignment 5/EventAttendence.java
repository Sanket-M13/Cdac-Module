import java.util.*;
class EventAttendence{
	public static void main(String args[]){
		Set<String> Attendes = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Attendes");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the Names: ");
			String Names = sc.nextLine();
			Attendes.add(Names);
		}
		
		System.out.println("Total unique attendes: "+ Attendes.size());
		
	}
	
}