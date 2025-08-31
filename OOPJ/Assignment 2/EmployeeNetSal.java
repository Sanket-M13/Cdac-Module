class EmployeeNetSal {
    static int counter = 1001;
    int id;
    String name;
    double basicSalary;

    EmployeeNetSal() {
        id = counter++;
        name = "Unknown";
        basicSalary = 20000;
    }

    EmployeeNetSal(String name, double basicSalary) {
        id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        double pf = 0.02 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    public static void main(String[] args) {
        EmployeeNetSal e1 = new EmployeeNetSal();
        EmployeeNetSal e2 = new EmployeeNetSal("Raj", 35000);

        System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getBasicSalary() + " Net: " + e1.calculateNetSalary());
        System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getBasicSalary() + " Net: " + e2.calculateNetSalary());
    }
}
