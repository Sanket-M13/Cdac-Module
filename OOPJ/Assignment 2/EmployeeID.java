class EmployeeID {
    static int counter = 1001;
    int id;
    String name;
    double basicSalary;

    EmployeeID() {
        id = counter++;
        name = "Unknown";
        basicSalary = 20000;
    }

    EmployeeID(String name, double basicSalary) {
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

    public static void main(String[] args) {
        EmployeeID e1 = new EmployeeID();
        EmployeeID e2 = new EmployeeID("Raj", 35000);

        System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getBasicSalary());
        System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getBasicSalary());
    }
}
