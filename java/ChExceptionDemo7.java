import java.util.*;
import java.io.*;

class ChExceptionDemo7{
	

	public static void main(String args[]) throws IOException{
		System.out.println("1");
		System.out.println("Enter any character:");
		
		System.out.println("2");
		
			int j = System.in.read();//Checked Exception IO
			System.out.println("Charcter="+(char)j);
			System.out.println("4");
			m1();
			System.out.println("5");
		
		System.out.println("8");
	}
				
	
	
	static void m1(){
		System.out.println("6");
		System.out.println("m1() : executed");
		//m2();
		System.out.println("7");
	}
	
	
		
	


}

