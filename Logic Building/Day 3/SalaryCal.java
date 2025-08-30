import java.util.*;

class SalaryCal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		int Salary =sc.nextInt();
		for(int i = 1; i<=12; i++){
		  Salary += 20000;
		  System.out.println("your Monthly Saving is :"+ Salary);
		}
		System.out.println("your Saving is :"+ Salary);
	}
}