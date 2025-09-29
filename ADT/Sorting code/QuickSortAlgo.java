class QuickSortAlgo{
	
		static void qSort(int arr[], int low, int high){
			if(low<high){
				int pi = partition(arr,low,high);
				qSort(arr,low,pi -1);
				qSort(arr,pi+1,high);
			}
		}
		
		static int partition(int arr[], int low, int high){
			int pivote = arr[high];
			int i = low - 1;
			
			for(int j = low; j<high; j++){
				if(arr[j]<=pivote){
					i++;
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			int temp = arr[i+1];
			arr[i+1] = arr[high];
			arr[high] = temp;
			
			return i+1;
		}
		
		static void display(int arr[]){
			for(int a: arr){
				System.out.print(a+" ");
			}
		}
	
	public static void main(String args[]){
		int arr[] = {4,1,2,7,1,5,9,6,8};
		int n = arr.length;
		qSort(arr, 0, n-1);
		display(arr);
	}
}