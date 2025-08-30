import java.util.Arrays;
import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
        }
        System.out.println(max);
        sc.close();
        
    }    
}
