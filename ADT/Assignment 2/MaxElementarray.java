class MaxElementarray{
	
	static int findMax(int arr[], int n){
		if(n == 1){
			return arr[0];
		}
		
		int max = findMax(arr, n-1);
		
		if(arr[n - 1] > max){
			return arr[n-1];
		}else{
			return max;
		}
	} 

	public static void main(String args[]){
		int[] arr = {10, 25, 47, 3, 19};
        int[] arr1 = {-5, -10, -3, -20, -7};
		
		System.out.println("Recursive method: "+ findMax(arr,arr.length));
		System.out.println("Recursive method (arr1): " + findMax(arr1, arr1.length));
	}
}