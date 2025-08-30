import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
             sum += arr[i];
        }
        int avg = sum/arr.length;
        System.err.println("Average = "+ avg);
        sc.close();
    }    
}
