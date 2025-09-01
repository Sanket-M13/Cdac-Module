import java.util.*;
class Arrays{
	public static void main(String args[]){
		int arr[] = new int[5];
		
		for(int i = 0; i< arr.length; i++){
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
			
		}
		
		
		for(int x: arr){
			System.out.print(x);
		}
	}
}