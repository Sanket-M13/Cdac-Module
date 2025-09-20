class GCD{
	
	public static void main(String args[]){
		int n = 17;
		int m = 13;
		int j = 0;
		for(int i = 1; i<m; i++){
		
			if(n%i == 0 && m % i == 0){
				j = i;
			}
		
		}
		System.out.println(j);
	
	}
}