import java.util.Scanner;

class ProblemTwo{
	
	static void AgeChecker(int age){
			if(age<18){
				System.out.println("You are a minor");
			}else if(age<=30){
				System.out.println("You are an adult");
			}else{
				System.out.println("You are a senior citizen");
			}
		}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		
		AgeChecker(age);
	
	}
}

