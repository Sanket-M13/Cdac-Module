import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial text:");
        String initialText = sc.nextLine();

        System.out.println("Enter text to insert:");
        String textToInsert = sc.nextLine();

        System.out.println("Enter insert index:");
        int insertIndex = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter text to append:");
        String textToAppend = sc.nextLine();

        StringBuilder sb = new StringBuilder(initialText);

        sb.insert(insertIndex, " " + textToInsert); 
        sb.append(" " + textToAppend);

        System.out.println(sb.toString());
    }
}
