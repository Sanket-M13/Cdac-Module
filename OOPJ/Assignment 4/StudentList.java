import java.util.*;
import java.io.*;

class StudentList{
	public static void main(String args[]){
		try{
			File f = new File("student_list.txt");
			FileReader fr = new FileReader(f);
		}catch(FileNotFoundException f1){
			System.out.println("File not found");
		}
	}
}