import java.util.Scanner;

class AgeNotValidException extends Exception{
	AgeNotValidException(String exception){
		super("AgeNotValidException: Age must be ≥ 18");
	}
}


class AgeRestriction{

	static void ageCal(int age) throws AgeNotValidException{
		if(age >= 18){
			System.out.println(age+ " Age is valid");
		}else{
			throw new AgeNotValidException("Invalid Age");
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try{
			ageCal(age);
		}catch(AgeNotValidException e){
			System.out.println(e.getMessage());
		}
	}
}