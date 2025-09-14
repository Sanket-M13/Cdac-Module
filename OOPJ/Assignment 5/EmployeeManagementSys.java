import java.util.*;

class Employee{
	String name;
	int Salary;
	
	public Employee(String n, int sal){
		this.name = n;
		this.Salary = sal;
	}
	
	@Override
    public String toString() {
        return name + ":" + Salary;
    }	
}

class EmployeeManagementSys{
	public static void main(String args[]){
		List<Employee> Emp = new ArrayList<>();
		
		Emp.add(new Employee("Amit", 50000));
		Emp.add(new Employee("Priya", 60000));
		
		for(Employee e: Emp){
			
			System.out.println(e);
		}
		
	}
}	