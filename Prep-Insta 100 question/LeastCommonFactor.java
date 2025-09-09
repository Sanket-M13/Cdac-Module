import java.util.Scanner;
class LeastCommonFactor{
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
		
		int LCM = (n1 * n2)/hcf;
		System.out.println("LCM = "+ LCM);
		
		
		}

	}