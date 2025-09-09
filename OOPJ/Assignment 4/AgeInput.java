import java.util.Scanner;
class AgeInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		String age = sc.nextLine();
		
		try{
			int n = Integer.parseInt(age);
			System.out.println("Your age is: "+ n);
		}catch(NumberFormatException e){
			System.out.println("Invalid number format");
		}
			
	}
}