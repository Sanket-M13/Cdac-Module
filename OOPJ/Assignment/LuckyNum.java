import java.util.Scanner;
class LuckyNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4-digit Number: ");
		int num = sc.nextInt();
		
		int A = num / 1000;          
        int B = (num / 100) % 10;    
        int C = (num / 10) % 10;     
        int D = num % 10; 
		
		if(A+B == C+D){
			System.out.print("Its a lucky Number");
		}else{
			System.out.print("Not a lucky number");
		}
	}
}