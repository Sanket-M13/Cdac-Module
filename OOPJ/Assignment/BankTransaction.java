import java.util.Scanner;

class BankTransaction{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter transaction amount: ");
		int amt = sc.nextInt();
		
		if(amt >= 0){
			System.out.println("Deposit Transaction");
		}else{
			System.out.println("Withdrawal Transaction");
		}
	}
}