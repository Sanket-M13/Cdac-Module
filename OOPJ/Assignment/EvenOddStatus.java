import java.util.Scanner;
class EvenOddStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd");
        } else {
            System.out.println("Numbers are mixed (one even, one odd)");
        }

        sc.close();
    }
}
