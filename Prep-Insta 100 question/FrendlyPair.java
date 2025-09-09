import java.util.Scanner;
class FrendlyPair{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum1 = 0;
		for(int i =1 ; i<= n1; i++){
			if(n1 % i == 0){
				sum1 += i;
			}
		}
		int sum2 = 0;
		
		for(int i =1 ; i<= n2; i++){
			if(n2 % i == 0){
				sum2 += i;
			}
		}
		
		if(sum1 * n2 == sum2 * n1){
			System.out.println("Yes they are friendly pair");
		}else{
			System.out.println("No they are not a friendly pair");
		}
	}

}