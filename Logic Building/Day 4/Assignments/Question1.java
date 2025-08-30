import java.util.Scanner;

class Question1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
         sc.close();
    }
}