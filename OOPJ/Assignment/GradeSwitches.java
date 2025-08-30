import java.util.Scanner;

class GradeSwitches {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10: 
            case 9:  
            case 8:  
                System.out.println("Grade: A");
                break;
            case 7:  
                System.out.println("Grade: B");
                break;
            case 6:  
            case 5:  
                if (marks >= 55) {
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: D");
                }
                break;
            case 4:  
                if (marks >= 45) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: E");
                }
                break;
            case 3:  
            case 2:  
                System.out.println("Grade: E");
                break;
            case 1: 
            case 0:  
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid marks! Enter 0–100.");
        }
    }
}
