import java.util.*;
import java.io.*;

class ChExceptionDemo3{
	

	public static void main(String args[]){
		m1();
	
				
	}
	
	static void m1(){
		System.out.println("m1() : executed");
		m2();
	}
	
	static void m2(){
		System.out.println("m2() : executed");
		System.out.println("Enter any character:");
		try{
			int j = System.in.read();
			System.out.println("Charcter="+(char)j);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}


}

