import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc.nextInt();

        for(int i= 1; i<=N; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }    
}
