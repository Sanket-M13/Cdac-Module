import java.util.Scanner; 
class GreatestNumInThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter the Third number: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.print(num1+" is greator");
			
		}else if(num2 > num1 && num2 > num3){
			System.out.print(num2 +" is greator");
		}else{
			System.out.print(num3 + "is greator");
		}
	}
	
}