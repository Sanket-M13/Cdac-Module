import java.util.Scanner;

class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;
        if (a > b) {
            temp = a; 
            a = b; 
            b = temp;
        }
        if (a > c) {
            temp = a; 
            a = c; 
            c = temp;
        }
        if (b > c) {
            temp = b; 
            b = c; 
            c = temp;
        }
        System.out.println("Ascending order: " + a + ", " + b + ", " + c);
    }
}
