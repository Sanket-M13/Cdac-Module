class MinElementarray{
	
	static int findMin(int arr[], int n){
		if(n == 1){
			return arr[0];
		}
		
		int min = findMin(arr, n-1);
		
		if(arr[n - 1] < min){
			return arr[n-1];
		}else{
			return min;
		}
	} 

	public static void main(String args[]){
		int[] arr = {10, 25, 47, 3, 19};
        int[] arr1 = {-5, -10, -3, -20, -7};
		
		System.out.println("Recursive method: "+ findMin(arr,arr.length));
		System.out.println("Recursive method (arr1): " + findMin(arr1, arr1.length));
	}
}