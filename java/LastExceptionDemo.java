import java.util.*;
import java.io.*;


class SalaryException extends Exception{
	
	SalaryException(){
		
		super("Aisa bhi kao salary hota hai kay ?");// custom exception message
		System.out.println("100000");
	}
	
}
public class LastExceptionDemo {
	
	static void salary(float sal) throws SalaryException {
		if(sal > 10000){
			System.out.println("Salary = "+sal);
		}else{
			throw new SalaryException();//Throw custom exception
		}
	}

	public static void main(String args[]) {
		System.out.println("1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary :");
		float s = sc.nextFloat();
		
		try{
			salary(s);//Exception : user exception
		}catch(SalaryException e){
			e.printStackTrace();
			
			System.out.println("Ho gaya Exception!!!!" + e.getMessage());
		}
		
		System.out.println("4");
	}

}

