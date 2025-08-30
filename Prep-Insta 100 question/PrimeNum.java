import java.util.Scanner;
class PrimeNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i<=num; i++){
			if(num % i == 0){
				count++;
			}
		}
		if(count == 2){
			System.out.print("It is a prime number");
		}else{
			System.out.print("It is not a prime number");
		}
		
	}
}