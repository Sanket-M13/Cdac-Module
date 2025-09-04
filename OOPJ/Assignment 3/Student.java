class Student{
	private int marks;
	
	void setMarks(int marks){
		if(marks <=100 && marks >= 0){
			this.marks = marks;
		}else{
			System.out.println("Enter valid marks");
		}
	}
	
	
	int getMarks(){
		return marks;
	}
	
	public static void main(String args[]){
	
		Student s1 = new Student();
		
		s1.setMarks(80);
		System.out.println("Marks = "+ s1.getMarks());
	}
	
	
	
}