class Secondlargest{
	
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		
		int first = arr[0];
		int second = first;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}
		}
		System.out.println("Second largest Element: "+ second);
		
	}
}