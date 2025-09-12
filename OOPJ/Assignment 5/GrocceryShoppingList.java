import java.util.*;
class GrocceryShoppingList{
	public static void main(String args[]){
		List<String> items = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of items: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i< n; i++){
			System.out.print("Add items: ");
			String item = sc.nextLine();
			items.add(item);
		}
		
		System.out.print("Enter the purchased item:");
		String toRemove = sc.nextLine();
		items.remove(toRemove);
		System.out.println("Item removed");
		
		System.out.print("Items to buy "+ items);
		
		
	}
}