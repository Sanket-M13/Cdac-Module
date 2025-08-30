import java.util.Scanner;

class NumberCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "Number is Positive" : (num < 0) ? "Number is Negative" : "Number is Zero";

        System.out.println(result);
    }
}
