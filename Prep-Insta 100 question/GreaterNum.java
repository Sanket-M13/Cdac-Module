import java.util.Scanner; 
class GreaterNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second number: ");
		int num2 = sc.nextInt();
		
		if(num1 >= num2){
			if(num1 == num2){
				System.out.println("Both are same");
			}else{
				System.out.println("First number is Greater");
			}
		}else{
			System.out.println("Second number is Greater");
		}
		
		String str = num1 > num2 ? "First is greator" : "Second is greater";
		System.out.print(str);
		
		
	}
}