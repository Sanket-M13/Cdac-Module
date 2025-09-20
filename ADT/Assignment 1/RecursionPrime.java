class RecursionPrime{

	static boolean isPrime(int n , int i){
	
		if(i == 1)
			return true;
		
		if(n % i == 0)
			return false;
		
		return isPrime(n , i - 1);
	}

	public static void main(String args[]){
		int n = 15;
		
		int i = 2;
		
		System.out.println(isPrime(n ,n - 1));
	}

}