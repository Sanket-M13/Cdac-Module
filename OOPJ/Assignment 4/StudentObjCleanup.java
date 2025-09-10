class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    static void finalize() {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}

class StudentObjCleanup{
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
		s1.finalize();
        s1 = null;

        System.gc();

    }
}
