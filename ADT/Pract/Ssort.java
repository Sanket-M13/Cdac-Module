class Ssort{
	void sSort(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n-1; i++){
			int min = i;
			for(int j = i+1; j<n; j++){
				if(arr[j] < arr[min]){
					min = j;
					
					
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n; i++){
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String args[]){
		Ssort b1 = new Ssort();
		int arr[] = {11,22,15,44,55,66};
		b1.sSort(arr);
		
		System.out.println("Selection sort");
		b1.display(arr);
	}
}