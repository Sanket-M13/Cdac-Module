import java.util.*;

class StudentGradeManagement{
	public static void main(String args[]){
		Map<String,Integer> Students = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the names: ");
			String names = sc.nextLine();
			
			System.out.print("Enter the Marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			Students.put(names, marks);
		}
		
		System.out.print("Grade Report: ");
		for(Map.Entry<String, Integer> m : Students.entrySet()){
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}
}