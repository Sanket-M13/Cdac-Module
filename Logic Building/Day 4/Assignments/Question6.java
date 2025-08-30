import java.util.Scanner;

class Question6 {
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5] ;
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.err.println("Your elements are");
        for(int ele: arr){
            System.err.println(ele);
        }
        sc.close();
    }
}
