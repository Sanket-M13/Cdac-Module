import java.util.Scanner;

class ArithmeticMenuIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        } else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero not allowed.");
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
