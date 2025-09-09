import java.util.*;
import java.io.*;

class ChExceptionDemo9 {
	

	public static void main(String args[]) throws FileNotFoundException {
		System.out.println("1");
		
		File f = new File("abc.txt");
		System.out.println("2");
		FileReader fr = new FileReader(f);//checked Exception
		System.out.println("3");
		
		System.out.println("4");
	}

}

