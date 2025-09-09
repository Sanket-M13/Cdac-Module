import java.util.*;
import java.io.*;
class ExceptionDemo17{
	

	public static void main(String args[]){
	System.out.println("1");
		
		try{
			System.exit(0);
		throw new NullPointerException();//int i =1/0;
		
		
		}catch(Exception e){
			//System.exit(0);
			e.printStackTrace();
		
		}finally{
			System.out.println("Finally .....");
		}
		
	
	System.out.println("stop");
		
			
	}

}

