import java.util.Scanner;
class StrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		
		int sum = 0;
		
		while(n > 0){
			int digit = n % 10;
			int fact = 1;
			for(int i = 1; i<=digit; i++){
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		if(sum == original){
			System.out.print("It is a strong number");
		}else{
			System.out.print("it is not a strong number");
		}
	}
}