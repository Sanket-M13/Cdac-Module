import java.util.Scanner;
import java.util.Arrays;

class Question12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
        }
}
