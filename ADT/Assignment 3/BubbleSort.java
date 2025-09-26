class BubbleSort{

	static void bSort(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void display(int arr[]){
		int n = arr.length;
		for(int i = 0; i<n; i++){
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String args[]){
		int arr[] = {5,2,9,1,5,6};
		bSort(arr);
		display(arr);
	}
}