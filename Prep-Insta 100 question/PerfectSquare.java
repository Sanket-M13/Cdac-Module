import java.util.*;
class PerfectSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double sqrt = Math.sqrt(n);
		int g = (int)sqrt;
		
		int sq = g * g;
		
		if(sq == n){
			System.out.print("It is a perfect Square");
		}else{
			System.out.print("It is not a perfect Square");
		}
		
	}
}