import java.util.Scanner;

class GradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage marks: ");
        int marks = sc.nextInt();
		String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 76) {
            grade = "A";
        } else if (marks >= 66) {
            grade = "B+";
        } else if (marks >= 51) {
            grade = "B";
        } else if (marks >= 36) {
            grade = "C";
        } else {
            grade = "Fail";
        }
		System.out.println("Grade: " + grade);
    }
}
