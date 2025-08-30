import java.util.Scanner;

class Question7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Your array sum is "+sum);
        sc.close();
    }
}
