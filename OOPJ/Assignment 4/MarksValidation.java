import java.util.Scanner;
class MarksValidation{

	static void marksValidation(int marks)throws Exception{
		if(marks >= 0 && marks <=100){
			System.out.println(marks+ " is valid");
		}else{
			throw new Exception("Invalid marks");
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		try{
			marksValidation(marks);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}