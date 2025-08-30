import java.util.Scanner;

class Question8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []arr = new String[4] ;
        System.out.println("Enter 4 names: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Your Names");
        for (String string : arr) {
            System.out.println(string);
        }
        sc.close();
     }    
}
