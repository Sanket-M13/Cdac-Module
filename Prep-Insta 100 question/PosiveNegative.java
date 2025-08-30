import java.util.Scanner;
class PosiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num >= 0){
			if(num == 0){
				System.out.print("Zero");
			}else{
				System.out.print("Positive");
			}
		}else{
			System.out.print("Negative");
		}
	}
}