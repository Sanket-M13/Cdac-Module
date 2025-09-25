class Isort{
	void iSort(int arr[]){
		int n = arr.length;
		
		for(int i = 1; i<n; i++){
			int key = arr[i];
			int j = i - 1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n; i++){
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String args[]){
		Isort b1 = new Isort();
		int arr[] = {11,22,45,15,11,44,22,55,78,66};
		b1.iSort(arr);
		
		System.out.println("Insertion sort");
		b1.display(arr);
	}
}