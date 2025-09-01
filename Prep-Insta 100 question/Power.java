import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int mult = 1;
		for(int i = 1; i<=p; i++){
			mult *= n;
		}
		System.out.println(mult);
		
	}
}