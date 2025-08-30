import java.util.Scanner;

class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        // int m = 3;

        for (int i = 1; i <= N; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }
         sc.close();
    }
    
}
