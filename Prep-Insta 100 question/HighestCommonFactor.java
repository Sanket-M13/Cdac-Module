import java.util.Scanner;
class HighestCommonFactor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int hcf = 0;
		int smaller = (n1 > n2) ? n1: n2;

		for(int i = 1; i<= smaller; i++){
			if(n1 % i == 0 && n2 % i == 0){
				hcf = i;
			}
		}
		
		System.out.println("Hcf = "+ hcf);
		
		
		}

	}