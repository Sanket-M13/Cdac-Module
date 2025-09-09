import java.io.*;
import java.util.Scanner;

// User-defined exception class
class SalaryException extends Exception {
    SalaryException() {
        super("What !!!! This is not any salary??????"); // Custom exception message
    }
}

public class Test {
    // Method to validate salary
    static void salary(float sal) throws SalaryException {
        if (sal > 10000) {
            System.out.println("Salary = " + sal);
        } else {
            throw new SalaryException(); // Throw custom exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        float s = sc.nextFloat();

        try {
            salary(s); // Call method to validate salary
        } catch (SalaryException e) {
            System.out.println(e); // Catch and print exception message
        }
    }
}