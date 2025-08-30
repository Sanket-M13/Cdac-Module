import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Locker number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.print("Even Locker number");
		}else{
			System.out.print("Odd Locker number");
		}
		
	}
}