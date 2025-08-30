import java.util.Scanner;
class ExamAttendance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total classes held: ");
		int  totalClasses = sc.nextInt();
		
		System.out.print("Enter classes attended: ");
		int  attendedClasses = sc.nextInt();
		
		double attendance = (attendedClasses * 100.0) / totalClasses;

        System.out.println("Attendance Percentage: " + attendance + "%");

        if (attendance >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

	}
}