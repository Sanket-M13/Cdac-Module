import java.util.Scanner;
class ExamScores{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the marks: ");
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index to access the data");
		int index = sc.nextInt();
		
		try{
			System.out.println("Your index Marks = "+ arr[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed");
		}
	}	
}