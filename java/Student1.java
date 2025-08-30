

class Student1{
	String name;
	int age;
	
	void display(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
	
	
		public static void main(String args[]){
			
			Student1 s4 = null;
			Student1 s1 = new Student1();
			
			System.out.println("Main Execution started");
			Student1 s1 = new Student1();
			s1.name= "Kiran";
			s1.age=22;
			s1.display();
			

			s1.name= "Rahul";
			s1.age=23;
			s1.display();
			
			Student1 s2 = new Student1();
			s2.display();
			
			Student1 s3 = new Student1();
			s3.name= "Rahul";
			s3.age=23;
			s3.display();
	
	}
	
	
}











