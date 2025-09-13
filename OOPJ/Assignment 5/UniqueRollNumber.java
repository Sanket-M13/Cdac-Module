import java.util.*;

class UniqueRollNumber{
	public static void main(String args[]){
		Set<String> RollNo = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Roll No: ");
        int n = sc.nextInt();
        sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the roll no: ");
            String roll = sc.nextLine();
			RollNo.add(roll);
		}
		
		System.out.println("Unique Roll Number: "+ RollNo);
	}
}