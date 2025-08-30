import java.util.Scanner;

class ReversePalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;
		
        while (num > 0) {
            int digit = num % 10;        
            rev = (rev * 10) + digit; 
            num /= 10;                  
        }

        System.out.println("Reversed number: " + rev);
        if (original == rev) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
}
