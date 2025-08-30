import java.util.Scanner;

class DayTypeSelection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        int dayType = sc.nextInt();

        if (dayType == 1) {
            System.out.println("It’s a workday. Time to work!");
        } else if (dayType == 2) {
            System.out.println("It’s weekend. No work today.");
        } else {
            System.out.println("Invalid input!");
        }
    }
}