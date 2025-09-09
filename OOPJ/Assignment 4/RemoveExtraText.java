import java.util.Scanner;

class RemoveExtraText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("Please read - Do not disturb");

        System.out.print("Exact substring to delete: ");
        String toDelete = sc.nextLine();

        int index = str.indexOf(toDelete);
		
		str.delete(index, index + toDelete.length());
		
        System.out.print(str);
	}	
}