class FindMin{

	public static void main(String args[]){
		int arr[] = {-4, -15, -7, -2, -30};
		int min = arr[0];
		for(int i = 1; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Minimum Element: "+ min);
	}
}