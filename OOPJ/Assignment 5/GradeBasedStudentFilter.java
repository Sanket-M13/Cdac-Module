import java.util.*;

class GradeBasedStudentFilter {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new TreeMap<>();

        studentGrades.put("Amit", 85);
        studentGrades.put("Priya", 52);
        studentGrades.put("Rohan", 78);

        System.out.println("Initial Student Grades:");
        studentGrades.forEach((name, grade) -> System.out.println(name + ": " + grade));

        int threshold = 60;
        System.out.println("Removing students with marks below " + threshold + "...");

        studentGrades.values().removeIf(grade -> grade < threshold);

        studentGrades.forEach((name, grade) -> System.out.println(name + ": " + grade));
    }
}
