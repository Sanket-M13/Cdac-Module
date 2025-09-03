import java.util.Scanner;
class HarshadNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orignal = n;
		int temp = n;
		int len = 0;
		while(temp > 0){
		len++;
		temp /=10;
		}
		int sum = 0;
		for(int i = 0; i<=len; i++){
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		
		if(orignal % sum == 0){
			System.out.println("It's a Harshad number");
		}else{
			System.out.println("It's not a Harshad number");
		}
		
	}
}