import java.util.Scanner;

class ProblemSixth{
	static void calculateSum(int num){
		int sum = 0;
		for(int i = 1; i<=num; i++){
			sum += i;
		}
		System.out.println("The sum of number from 1 to "+ num + " is " + sum);
		
	}
		
	
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		calculateSum(num);
		sc.close();
	}

}