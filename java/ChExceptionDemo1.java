import java.util.*;
import java.io.*;

class ChExceptionDemo1{
	

	public static void main(String args[]){
		System.out.println("start");
		//int i = Integer.parseInt("ab");//Unchecked Exception: NumberFormatException : Runtime
		
		try{
			int j =System.in.read();//Checked Exception : IOException : Compiletime
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
		
	
	
	System.out.println("stop");
		
			
	}

}

