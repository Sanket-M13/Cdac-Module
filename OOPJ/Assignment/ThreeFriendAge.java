import java.util.Scanner;

class ThreeFriendAge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int F1 = sc.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int F2 = sc.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int F3 = sc.nextInt();

        
        if (F1 > F2 && F1 > F3) {
            System.out.println("Oldest: Friend 1");
        } else if (F2 > F1 && F2 > F3) {
            System.out.println("Oldest: Friend 2");
        } else if (F3 > F1 && F3 > F2) {
            System.out.println("Oldest: Friend 3");
        } else {
            System.out.println("There is a tie for the oldest!");
        }

        
        if (F1 < F2 && F1 < F3) {
            System.out.println("Youngest: Friend 1");
        } else if (F2 < F1 && F2 < F3) {
            System.out.println("Youngest: Friend 2");
        } else if (F3 < F1 && F3 < F2) {
            System.out.println("Youngest: Friend 3");
        } else {
            System.out.println("There is a tie for the youngest!");
        }
    }
}
