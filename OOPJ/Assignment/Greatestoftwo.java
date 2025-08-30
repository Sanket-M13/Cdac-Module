import java.util.Scanner;
class Greatestoftwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the score for Test 1: ");
		int test1 = sc.nextInt();
		System.out.print("Enter the score for Test 2: ");
		int test2 = sc.nextInt();
		
		if(test1 > test2){
			System.out.print("Test 1 has higher Score");
		}else{
			System.out.print("Test 2 has higher score");
		}
	
	}
}