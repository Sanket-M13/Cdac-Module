import java.util.Scanner;
class EmployeeData{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employee: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the saleries: ");
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the hours of work : ");
		int hours = sc.nextInt();
		System.out.println("Enter the index to access the data");
		int index = sc.nextInt();
		
		try{
			int salary = arr[index];
			try{
				double hourwages = arr[index] / hours;
				System.out.println("hourly wages for "+arr[index]+" are "+ hourwages);
			}catch(ArithmeticException e){
				System.out.println("Division by zero");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed");
		}
	}	
}