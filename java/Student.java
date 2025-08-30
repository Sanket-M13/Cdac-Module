

class Student{
	String name;
	int age;
	
	void display(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
	
	
		public static void main(String args[]){
			
			
			System.out.println("Main Execution started");
			Student s1 = new Student();
			s1.name= "Kiran";
			s1.age=22;
			s1.display();
			
			Student s2 = new Student();
			s2.name= "Rahul";
			s2.age=23;
			s2.display();
			
	
	}
	
	
}











