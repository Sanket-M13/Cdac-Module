import java.util.Scanner;

class MessageUpdatedSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Original text: ");
		String str = sc.nextLine();
		
		System.out.print("Text to fine: ");
		String Texttofind = sc.nextLine();
		
		System.out.print("Replacement text: ");
		String replacement = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		int index  = sb.indexOf(Texttofind);
		
		sb.replace(index, index + Texttofind.length(), replacement);
		
		System.out.println(sb);
	}
}