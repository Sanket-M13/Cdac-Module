class GCDRecusrion{
	
	static int GCD(int a, int b){
		if(b == 0)
			return a;
			
		return GCD(b, a%b);
	}
	
	public static void main(String args[]){
	
		int a = 54;
		int b = 24;
		
		System.out.println(GCD(a,b));
	
	}

}