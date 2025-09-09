import java.util.Scanner;

class RemoveOutdatedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("CDAC Kharghar 2024");

        System.out.print("Exact substring to delete: ");
        String toDelete = sc.nextLine();

        int index = sb.indexOf(toDelete);
		sb.delete(index, index + toDelete.length());
        System.out.println("Updated Text: " + sb.toString());
    }
}
