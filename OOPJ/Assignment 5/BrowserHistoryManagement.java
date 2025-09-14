import java.util.*;
class BrowserHistoryManagement{
	public static void main(String args[]){
		Stack<String> History = new Stack<>();
		
		History.push("Google");
		History.push("Youtube");
		History.push("GFG");
		
		System.out.println("Page visited: "+ History);
		
		System.out.println("Action:Back (1 page)");
		
		String action = History.pop();
		
		System.out.println("Current History: "+ History);
		
	}
}