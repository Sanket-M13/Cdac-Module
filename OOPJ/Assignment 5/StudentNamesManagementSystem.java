import java.util.*;

class StudentNamesManagementSystem{
	public static void main(String args[]){
		ArrayList<String> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Student: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student: ");
            String name = sc.nextLine().trim(); 
            students.add(name);
        }
		System.out.print("Press 1 to add student and 0 to show the list: ");
		int c = sc.nextInt();
		sc.nextLine();
		
		if(c == 1){
			System.out.print("Enter the name of student to Remove: ");
			String name = sc.nextLine();
			
			students.remove(name);
			System.out.print(students);
		}else if(c == 0){
			System.out.println(students);
		}else{
			System.out.println("Enter valid in put");
		}
	}
}