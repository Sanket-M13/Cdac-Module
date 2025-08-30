import java.util.Scanner;

class DaysInMonthS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        int days;

        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            System.out.println("Invalid month number!");
            return;
        }

        System.out.println(days + " days");
    }
}
