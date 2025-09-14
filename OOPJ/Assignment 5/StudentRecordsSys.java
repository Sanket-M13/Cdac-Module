import java.util.*;

class Student{
	String name;
	String Grade;
	
	public Student(String n, String g){
		this.name = n;
		this.Grade = g;
	}
	
	@Override
    public String toString() {
        return name + ":" + Grade;
    }	
}

class StudentRecordsSys{
	public static void main(String args[]){
		List<Student> record = new ArrayList<>();
		
		record.add(new Student("Amit", "A"));
		record.add(new Student("Priya", "B"));
		
		for(Student s: record){
			
			System.out.println(s);
		}
		
	}
}	