import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();
        int fact = 1;

        for(int i = N; i>0; i--){
         fact *= i;

        }
        System.out.println(fact);
        sc.close();
    }    
}
