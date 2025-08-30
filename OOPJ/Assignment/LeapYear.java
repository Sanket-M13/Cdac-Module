import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0  ){
			System.out.print("It is a leap year");
		}else{
			System.out.print("It is not a leap year");
		}
	}
}