import java.util.Scanner;

class DayOfWeekTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        String result = (day == 1) ? "Monday" :
                        (day == 2) ? "Tuesday" :
                        (day == 3) ? "Wednesday" :
                        (day == 4) ? "Thursday" :
                        (day == 5) ? "Friday" :
                        (day == 6) ? "Saturday" :
                        (day == 7) ? "Sunday" :
                        "Invalid input!";

        System.out.println("Day is " + result);
    }
}
