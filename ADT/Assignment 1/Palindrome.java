class Palindrome{

	public static void main(String args[]){
	
		int n = 1234321;
		int orignal = n;
		int rev = 0;
		while(n != 0){
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		if(rev == orignal)
			System.out.println(true);
		else
			System.out.println(false);
	}

}