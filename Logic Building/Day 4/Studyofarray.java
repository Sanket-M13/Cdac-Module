class Studyofarray{
	public static void main(String args[]){
	
		int[] array = {2,2,3,4,34,324,32,23};
		
		for(int i = 0; i< array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int arr: array){
			System.out.println(arr);
		}
	}

}