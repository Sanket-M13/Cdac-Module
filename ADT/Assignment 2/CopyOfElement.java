class CopyOfElement{

	public static void main(String args[]){
		int source[] = {10,20,30,40,50};
		int n = source.length;
		int dest[] = new int[n];
		for(int i = 0; i<n; i++){
			dest[i] = source[i];
		}
		
		for(int i = 0; i<n; i++){
			System.out.print(" "+dest[i]);
		}
		
	}
}