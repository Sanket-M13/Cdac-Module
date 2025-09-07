abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}

class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
	double hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    double calculateSalary() {
        return basicSalary + hra;
    }

    public double calculateBonus() {
        return calculateSalary() * 0.10;
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
	double hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class EmployeeManagementSystem{
    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee("Amit", 1, 50000, 5000);
        PermanentEmployee e2 = new PermanentEmployee("Ravi", 2, 40000, 4000);

        ContractEmployee c1 = new ContractEmployee("Neha", 3, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Raj", 4, 250, 120);

        System.out.println(e1.name + " Salary = " + e1.calculateSalary() + ", Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Salary = " + e2.calculateSalary() + ", Bonus = " + e2.calculateBonus());
        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}
