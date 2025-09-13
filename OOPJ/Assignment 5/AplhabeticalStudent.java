import java.util.*;

class AplhabeticalStudent{
	public static void main(String args[]){
		List<String> Names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Student: ");
        int n = sc.nextInt();
        sc.nextLine();
		
		for(int i = 0; i<n; i++){
			System.out.print("Enter the Name of Student: ");
            String name = sc.nextLine();
			Names.add(name);
		}
		Collections.sort(Names, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Students: "+ Names);
	}
}