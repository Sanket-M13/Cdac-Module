class SquareRoot{

	static int Sqrt(int x){
	
		int i = 1;
		while(i * i <= x){
			i++;
		}
		return i - 1;
	
	}
	public static void main(String args[]){
		
		int x = 24;
		
		System.out.println(Sqrt(x));
	}
}