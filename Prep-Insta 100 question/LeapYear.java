import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int num = sc.nextInt();
		
		if( num % 4 == 0 && num % 100 != 0 || num % 400 == 0){
			System.out.println("It is a leap year.");
		}else{
			System.out.print("Its not a leap Year");
		}
	}
}