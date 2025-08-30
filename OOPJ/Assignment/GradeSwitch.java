import java.util.Scanner;
class GradeSwitch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		
		if (marks >= 85) {
			System.out.print("Grade: A");
		} else if (marks >= 70 && marks <= 84) {
			System.out.print("Grade: B");
		} else if (marks >= 55 && marks <= 69) {
			System.out.print("Grade: C");
		} else if (marks >= 45 && marks <= 54) {
			System.out.print("Grade: D");
		} else if (marks >= 25 && marks <= 44) {
			System.out.print("Grade: E");
		} else if (marks >= 0 && marks <= 24) {
			System.out.print("Grade: F");
		} else {
			System.out.print("Invalid marks entered.");
		}
	}
}