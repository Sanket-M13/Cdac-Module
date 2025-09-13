import java.util.*;

class StudentRegistrationOrderTracker{
	public static void main(String args[]){
		Map<String,Integer> Registrations = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Registrations");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the names: ");
			String names = sc.nextLine();
			
			System.out.print("Enter the RollNo: ");
			int roll = sc.nextInt();
			sc.nextLine();
			Registrations.put(names, roll);
		}
		
		System.out.print("Registration Order: ");
		for(Map.Entry<String, Integer> m : Registrations.entrySet()){
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}
}