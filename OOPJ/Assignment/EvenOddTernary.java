import java.util.Scanner;

class EvenOddTernary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Number is Even" : "Number is Odd";

        System.out.println(result);
    }
}