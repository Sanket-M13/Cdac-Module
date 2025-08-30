import java.util.Scanner;
class Bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int sal = sc.nextInt();
		System.out.print("Enter Salary: ");
		int Service = sc.nextInt();
		
		if(Service > 5){
			double bonus = sal * 5 / 100;
			System.out.print("Bonus amount: "+ bonus);
		}else{
			System.out.print("Bonus amount = 0");
		}
		
		
	}
}