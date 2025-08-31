class Students{
    String name;
    String className;

    static int tuitionFee;


    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    Students(String name, String className) {
        this.name = name;
        this.className = className;
    }


    void setName(String name) {
        this.name = name;
    }

    void setClassName(String className) {
        this.className = className;
    }

    String getName() {
        return name;
    }

    String getClassName() {
        return className;
    }

    static int getTuitionFee() {
        return tuitionFee;
    }

    void showDetails() {
        System.out.println("Student: Name=" + name +", Class=" + className +", Tuition Fee=" + tuitionFee);
    }




    public static void main(String[] args) {
        Students s1 = new Students("Anjali", "10th");
        Students s2 = new Students("Vikram", "12th");

        s1.showDetails();
        s2.showDetails();
    }
}
