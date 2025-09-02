import java.util.*;

class primeFactor{
	public static boolean isprime(int n){
		if(n<=1) return false;
      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0) return false;
      }

      return true;
   }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i<=n; i++){
			 while (n % i == 0) {  
                if (isprime(i)) {
                    System.out.println(i);
                }
                n /= i;
		}
	}
}
}