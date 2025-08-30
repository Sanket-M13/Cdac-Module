import java.util.Scanner;

class Passfail{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks: ");
		int mark = sc.nextInt();
		
		if(mark >= 35){
			System.out.print("Student has Passed");
		}else{
			System.out.print("Student has Failed");
		}
	}
	
}