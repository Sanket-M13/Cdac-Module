import java.util.Scanner;

class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[6];
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int PositiveCount = 0;
        int NegativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PositiveCount++;
            }else if(arr[i] < 0){
                NegativeCount++;
            }
        }
        System.err.println("Positve count are :"+ PositiveCount);
        System.err.println("Negative count are :"+ NegativeCount);
        sc.close();
    }    
}
