import java.util.Scanner;

class ProblemFourth{
	static Scanner sc = new Scanner(System.in); 
	static void askForPositiveNumber(){
		int num;
		do{
		System.out.println("Enter Positive Number");
		num = sc.nextInt();
			
		}while(num <= 0);
		System.out.println("You entered positive number "+ num);
	}
	
	
	public static void main(String args[]){
	     
		askForPositiveNumber();
		sc.close();
	}

}