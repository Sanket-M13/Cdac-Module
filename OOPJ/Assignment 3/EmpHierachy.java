class Employee{
	String name;
	double basicSalary;
	
	Employee(String s1, double basicSalary){
		this.name = s1;
		this.basicSalary = basicSalary;
	}
	
}

class RegularEmployee extends Employee {
	
	RegularEmployee(String name, double basicSalary){
		super(name,basicSalary);
	}	
	
	double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        return basicSalary + hra;
    }
}

class Contract extends Employee{
	Contract(String name, double basicSalary){
		super(name,basicSalary);
	}
	
	double calculateNetSalary(){
		double allowance = 0.05 * basicSalary;
		return basicSalary + allowance;		
	}
}

class EmpHierachy{
	public static void main(String args[]){
		RegularEmployee r1 = new RegularEmployee("Rahul", 20000);
		
		System.out.println(r1.name+" Net Salary = "+ r1.calculateNetSalary());
		
		Contract c1 = new Contract("Rahul",15000);
		
		System.out.println(c1.name+" Net Salary = "+ c1.calculateNetSalary());
	}
}