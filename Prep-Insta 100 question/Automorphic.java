import java.util.Scanner;
class Automorphic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sqr = n * n;
		int j = sqr % 10;
		
		if (sqr % Math.pow(10, String.valueOf(n).length()) == n) {
            System.out.println("Yes, it's an Automorphic Number");
        } else {
            System.out.println("No, it's not an Automorphic Number");
        }
	}
}