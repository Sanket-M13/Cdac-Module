import java.util.Scanner;

class Shopdiscount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount: ");
		int amount = sc.nextInt();
		int disc = 0;
		if( amount >= 1000 ){
			disc = amount * 10 / 100;
			amount = amount - disc;
			System.out.println("Final cost after discount: " + amount);
		}else{
			System.out.println("Final cost is :" + amount);
		}
	}
}