import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int original = num;
		int temp = num;
		
		int len = 0;
		while(temp > 0){
			len++;
			temp = temp / 10;
		}
		int sum = 0;
		temp = num;
		while(temp > 0){
			int digit = temp % 10;
			int mult = 1;
			for(int i= 0; i<len; i++){
				mult *= digit;
				
			}
			
			sum += mult; 
			temp = temp/10;
		}
		System.out.println(sum);
		
		  if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
	}
}