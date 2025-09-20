import java.util.Scanner;

class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Performing division
            int result = numerator / denominator;

            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            // Handles division by zero error
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (Exception e) {
            // Handles any other unexpected exception
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            // Always executes
            System.out.println("Execution completed. Closing resources...");
            sc.close();
        }
    }
}
