abstract class Employee{
	String name;
	double salary;	
	
	Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
	
	abstract void calculateBonus();
}

class Manager extends Employee{
	
	Manager(String n, double sal){
		super(n,sal);
	}
	
	@Override
	void calculateBonus(){
		double bonus = 0.20 * salary;
		System.out.println(name +" Bonus = "+ bonus);
	}
}
class Devloper extends Employee{
	
	
	Devloper(String n, double sal){
		super(n,sal);
	}
	@Override
	void calculateBonus(){
		double bonus = 0.10 * salary;
		System.out.println(name +" Bonus = "+ bonus);
	}
}

class EmployeeBonusCal{
	public static void main(String args[]){
		Manager m1 = new Manager("Anita",50000);
		m1.calculateBonus();
		
		Devloper d1 = new Devloper("Rohit", 40000);
		d1.calculateBonus();
	}
}