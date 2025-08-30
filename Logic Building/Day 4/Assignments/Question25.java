import java.util.Scanner;

class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the string");
        char[] chr = sc.next().toCharArray();
        int count = 0;
        for (char c : chr) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.err.println("The number of vowels in the string is: "+ count);
        sc.close();


    }    
}
