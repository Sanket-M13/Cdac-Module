class StudentMarks {
    int rollNo;
    String name;
    int marks;

    StudentMarks(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }



    public static void main(String[] args) {
        StudentMarks s1 = new StudentMarks(101, "Rahul", 50);
        s1.showDetails();

        s1.setMarks(85);
        System.out.println("After updating marks:");
        s1.showDetails();
    }
}
