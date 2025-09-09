import java.util.*;
import java.io.*;

class ChExceptionDemo8{
	

	public static void main(String args[]) {
		System.out.println("1");
		
		File f = new File("abc.txt");
		try{
			System.out.println("2");
		FileReader fr = new FileReader(f);//checked Exception
		System.out.println("3");
		}catch(FileNotFoundException e){
		}
		System.out.println("4");
	}

}

