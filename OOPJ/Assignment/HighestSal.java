import java.util.Scanner;
class HighestSal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary for company 1: ");
		int Sal1 = sc.nextInt();
		System.out.print("Enter salary for company 2: ");
		int Sal2 = sc.nextInt();
		System.out.print("Enter salary for company 3: ");
		int Sal3 = sc.nextInt();
		
		if(Sal1 > Sal2 && Sal1 > Sal3){
			System.out.print("Company 1 offers the highest salary");
		}else if(Sal2 > Sal1 && Sal2 > Sal3){
			System.out.print("Company 2 offers the highest salary");
		}else{
			System.out.print("Company 3 offers the highest salary");
		}
		
	}


}