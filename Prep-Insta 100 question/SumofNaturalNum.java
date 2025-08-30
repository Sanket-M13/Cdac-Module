import java.util.Scanner; 
class SumofNaturalNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num; i++){
			sum += i;
		}
		System.out.println("Sum of number is: "+ sum);
		//Next Method 
		sum = (num * (num + 1))/2;
		
		System.out.println("Sum of number is: "+ sum);
		
	}
}