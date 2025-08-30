import java.util.Scanner;

class Question26 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        
        String reversed = new StringBuilder(cleaned).reverse().toString();

       
        if (cleaned.equals(reversed)) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }

        sc.close();
    }    
}
