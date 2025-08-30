import java.util.Scanner;
class SquareOrRectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int len = sc.nextInt();
		System.out.print("Enter breadth: ");
		int breadth = sc.nextInt();
		
		if(len == breadth){
			System.out.print("Square garden");
		}else{
			System.out.print("Rectangle garden");
		}
	}
}