class StudentGrades{
    int rollNo;
    String name;
    int marks;

    StudentGrades(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    String calculateGrade() {
        if (marks >= 80){
			return "A";
		}else if(marks >= 60){
			return "B";
		}else if(marks >= 40){
			return "C";
		}else{
			 return "Fail";
		}
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentGrades s1 = new StudentGrades(101, "Rahul", 85);
        StudentGrades s2 = new StudentGrades(102, "Pooja", 55);

        s1.showDetails();
        s2.showDetails();
    }
}
