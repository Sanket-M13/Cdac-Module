import java.util.Scanner;

class ReportTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original title: ");
        String originalTitle = sc.nextLine();

        System.out.print("Department Name: ");
        String departmentName = sc.nextLine();

        StringBuilder sb = new StringBuilder(originalTitle);
        sb.insert(sb.indexOf("Report"), departmentName + " ");
        System.out.println(sb);
    }
}
