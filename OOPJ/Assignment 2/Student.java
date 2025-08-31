class Student{
    String name;
    int marks;

    static int totalStudents = 0;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalStudents++; 
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    boolean isPassed() {
        if(marks >= 35){
			return true;
		}else{
			return false;
		}
    }

    String getName() {
        return name;
    }
	
    static void showTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }



    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Pooja", 34);
        Student s3 = new Student("Amit", 65);

        System.out.println("Student " + s1.getName() + " Passed? " + s1.isPassed());
        System.out.println("Student " + s2.getName() + " Passed? " + s2.isPassed());
        System.out.println("Student " + s3.getName() + " Passed? " + s3.isPassed());

       
        Student.showTotalStudents();
    }	
}
