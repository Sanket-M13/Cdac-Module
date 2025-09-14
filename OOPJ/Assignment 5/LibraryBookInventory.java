import java.util.*;
class LibraryBookInventory{
	public static void main(String args[]){
		Map<String,Integer> Inventory = new TreeMap<>();
		
		Inventory.put("Java",3);
		Inventory.put("Python",5);
		
		System.out.println("Initial Inventory"+Inventory);
		
		String borrowTitle = "Java";
		int borrowcopy = 1;
		
		System.out.println("Borrowed:"+ borrowcopy+" From "+borrowTitle);
		
		if(Inventory.containsKey(borrowTitle)){
			int currentcopy = Inventory.get(borrowTitle);
			if(borrowcopy <= currentcopy ){
				Inventory.put(borrowTitle, currentcopy - borrowcopy);
				Inventory.forEach((book, copies) -> System.out.println(book + ": " + copies));
			}
		}
		
		
		
		
		
	
	}
}