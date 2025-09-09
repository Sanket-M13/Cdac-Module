import java.util.Scanner;

public class OnlineShopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        System.out.println("Enter total number of products:");
        int n = sc.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        System.out.println("Enter product index:");
        int index = sc.nextInt();

        try {
            if (quantity == 0) {
                throw new ArithmeticException();
            }

            double totalPrice = quantity * prices[index];
            System.out.println("Total price: " + totalPrice);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index outof bound");
        }
    }
}
