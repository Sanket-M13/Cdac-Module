class Fibbonacci{

	static int Fibbo(int n){
	
		if (n <= 1) {          
            return n;
        }else {
            return Fibbo(n - 1) + Fibbo(n - 2); 
        }
	
	}
	
	public static void main(String args[]){
		
		int n = 7;
		
		for(int i = 0; i<=n; i++){
			System.out.print(Fibbo(i)+" ");
		}
	}
}