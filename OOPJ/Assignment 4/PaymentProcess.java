import java.util.Scanner;

class PaymentProcess{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount as string: ");
		String str = sc.nextLine();
		
		System.out.print("Additional amount to add: ");
		String num = sc.nextLine();
		
		int m = Integer.parseInt(str);
		int n = Integer.parseInt(num);
		int o = m + n;
		System.out.println(m + "+" + n + "="+ o);
		
		
	}
}