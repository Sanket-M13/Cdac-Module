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

class StudentGradeFilter{
	public static void main(String args[]){
		List<Student> record = new ArrayList<>();
		
		record.add(new Student("Amit", "A"));
		record.add(new Student("Rohan", "B"));
		record.add(new Student("Priya", "C"));
		
		
		record.removeIf(s -> s.Grade.compareTo("B")>0);
		
		for(Student s: record){
			
			System.out.println(s);
		}
		
	}
}