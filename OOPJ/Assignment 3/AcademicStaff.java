class Staff {
    protected String name;   
    protected int salary;

    Staff(String name, int sal) {
        this.name = name;
        this.salary = sal;
    }
}

class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, int sal, String s) {
        super(name, sal);     
        this.subject = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, int sal, String d) {
        super(name, sal);     
        this.department = d;
    }

    void display() {
        System.out.println("Name: " + name + ", Department: " + department + ", Salary: " + salary);
    }
}

class AcademicStaff {
    public static void main(String args[]) {
        TeachingStaff ts = new TeachingStaff("Anita", 50000, "Math");
        ts.display();

        NonTeachingStaff nts = new NonTeachingStaff("Ramesh", 40000, "Admin");
        nts.display();
    }
}
