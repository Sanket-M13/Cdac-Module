class Employee{
	private int age;
	
	void SetAge(int age){
		if(age >= 18){
			this.age = age;
		}else{
			System.out.println("Invalid age");
		}
	}
	
	
	int getAge(){
		return age;
	}
	
	public static void main(String args[]){
	
		Employee e1 = new Employee();
		
		e1.SetAge(18);
		System.out.println("Age updated "+ e1.getAge());
	}	
}