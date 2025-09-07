import java.util.Scanner;

class Final{
	final int x;
	
	Final(int x){
		this.x = x;
	}
}

class Finaldemo1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Final f = new Final(n);
		System.out.println(f.x);
		int m = sc.nextInt();
		f.x = m;
		System.out.println(f.x);		
	}
}