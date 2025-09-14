
import java.util.*;

class Employee{
	String name;
	int salary;
	
	Employee(String name, int sal){
		this.name = name;
		this.salary = sal;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.salary;
	}
	
	static class SortbySal implements Comparator<Employee>{
		
		@Override
		public int compare(Employee a, Employee b) {
			return a.salary - b.salary;
		}
	}

}

public class EmployeeSalarySorting{

	public static void main(String[] args) {
			ArrayList<Employee> a = new ArrayList<>();
			
			a.add(new Employee("Amit",50000));
			a.add(new Employee("Sanjay",60000));
			a.add(new Employee("Rohan",45000));
			
			Collections.sort(a, new Employee.SortbySal());
			
			for(Employee e: a){
				System.out.println(e);
			}
			
	}

}
