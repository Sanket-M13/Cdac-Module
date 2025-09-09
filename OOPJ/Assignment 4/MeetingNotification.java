import java.util.Scanner;

class MeetingNotification{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("Meeting: ");

        System.out.print("Text to append: ");
        String text = sc.nextLine();

        str.append(text);
        System.out.print(str);
	}	
}