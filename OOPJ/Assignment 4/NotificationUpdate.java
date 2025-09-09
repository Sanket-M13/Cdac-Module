import java.util.Scanner;
class NotificationUpdate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder("Exam Postponed");
		
		System.out.print("Text to find: ");
		String insert = sc.nextLine();
		
		int index = str.indexOf(insert);
		
		System.out.print("Replacement Text: ");
		String Replacement = sc.nextLine();
		
		str.replace(index, index + insert.length(), Replacement);
		
		System.out.print(str.toString());
		
	}
}