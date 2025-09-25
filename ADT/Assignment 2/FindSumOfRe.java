class FindSumOfRe{

	static int sumOf(int arr[],int n){
	
		if(n == 0){
			return 0;
		}
		
		return arr[n -1] + sumOf(arr, n-1);
	}


	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		System.out.println("Sum of all Element: "+ sumOf(arr,arr.length));
	}
}