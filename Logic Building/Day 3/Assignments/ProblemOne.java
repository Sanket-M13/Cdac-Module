import java.util.Scanner;

class ProblemOne{
	
	static int sumOfTwoNumber(int num1,int num2){
			return num1 + num2;
		}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your First number");
		int num1 = sc.nextInt();
		System.out.println("Enter your Second number");
		int num2 = sc.nextInt();
		
		int Sum = sumOfTwoNumber(num1,num2);
		
		
		System.out.println("Your sum is "+ Sum);
	
	}

}