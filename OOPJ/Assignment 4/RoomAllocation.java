import java.util.Scanner;

class RoomAllocation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original text: ");
        String originalText = sc.nextLine();

        System.out.print("Text to insert: ");
        String texttoInsert = sc.nextLine();
		
		System.out.print("Insert index: ");
        int index = sc.nextInt();

        StringBuilder sb = new StringBuilder(originalText);
		
        sb.insert(index, texttoInsert + " ");
        System.out.println(sb);
    }
}