class primeNumber{
	public static void main(String args[]){
		
		int n = 15;
		int count = 0;
		for(int i = 1; i<=n; i++){
			if(n%i == 0){
				count++;
			}
		}
		
		if( count == 2 ){
			System.out.println("This is a prime Number");
		}else{
			System.out.println("This is not a prime Number");
		}
		
	}
}