import java.util.Scanner;

class ArmstrongRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int j = num1; j <= num2; j++) {
            int original = j;
            int temp = j;
            int len = 0;

            while (temp > 0) {
                len++;
                temp = temp / 10;
            }

            int sum = 0;
            temp = j;

         
            while (temp > 0) {
                int digit = temp % 10;
                int mult = 1;

                for (int i = 0; i < len; i++) {
                    mult *= digit;
                }

                sum += mult;
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
