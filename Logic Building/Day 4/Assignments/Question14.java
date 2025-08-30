import java.util.Arrays;
import java.util.Scanner;

class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to Search");
        int k = sc.nextInt();
        int a = Arrays.binarySearch(arr, k);
        System.err.println("The number "+k+ "is found at index "+a);
        sc.close();
    }
}
