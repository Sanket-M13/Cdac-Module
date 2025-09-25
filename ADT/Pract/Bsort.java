class Bsort{
	void bSort(int arr[]){
		int n = arr.length;
		int c = 0;
		// boolean x;
		for(int i = 0; i<n-1; i++){
			// x = false;
			c++;
			for(int j = 0; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					c++;
					// x = true;
				}
			}
			// if (!x) {
                // break;
            // }
		}
		System.out.println(c);
	}
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i = 0; i<n; i++){
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String args[]){
		Bsort b1 = new Bsort();
		int arr[] = {11,22,15,44,55,66};
		b1.bSort(arr);
		
		System.out.println("Bubble sort");
		b1.display(arr);
	}
}