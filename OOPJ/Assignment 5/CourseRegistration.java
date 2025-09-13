import java.util.*;
class CourseRegistration{
	public static void main(String args[]){
		Set<String> CourseCode = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of codes");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.println("Enter the codes: ");
			String code = sc.nextLine();
			CourseCode.add(code);
		}
		
		System.out.println("Registered Courses: "+ CourseCode);
		
	}
}