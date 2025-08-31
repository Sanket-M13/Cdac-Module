class Employee{
	String name;
	double salary;
	int YearOfService;
	
	static int totalEmployees;
	
	Employee(String name, double salary, int Service){
		this.name = name;
		this.salary = salary;
		this.YearOfService = Service;
		
		totalEmployees++;
	}
	
	String getName(){
		return name;
	}
	
	void SetName(String name){
		this.name = name;
	}
	
	double CalculateBonus(){
		double Bonus = 0;
		if(YearOfService > 5){
			Bonus = salary * 5/100;
		}
		return Bonus;
	}
	
	static void showTotalEmployees(){
		System.out.print("Total Employee: "+ totalEmployees);
	}
	
	public static void main(String args[]){
		Employee e1 = new Employee("Ravi", 150000, 6);
		Employee e2 = new Employee("Anita", 120000, 3);
		Employee e3 = new Employee("Suresh", 100000, 5);
		
		System.out.println("Employee "+ e1.getName()+" Bonus " + e1.CalculateBonus());
		System.out.println("Employee "+ e2.getName()+" Bonus " + e2.CalculateBonus());
		System.out.println("Employee "+ e3.getName()+" Bonus " + e3.CalculateBonus());
		
		showTotalEmployees();

	}
	
	
	
}