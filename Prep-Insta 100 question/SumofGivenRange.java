import java.util.Scanner; 
class SumofGivenRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		int num = sc.nextInt();
		System.out.print("Enter the Second number: ");
		int num2 = sc.nextInt();
		int sum = 0;
		for(int i = num; i<=num2; i++){
			sum += i;
		}
		System.out.println("Sum of number is: "+ sum);
		
	}
}