import java.util.*;
class CommandHistoryTracker{
	public static void main(String args[]){
		Queue<String> Commands = new LinkedList<>();
		
		Commands.add("ls");
		Commands.add("Pwd");
		Commands.add("cd ..");
		Commands.add("mkdir");
		
		
		System.out.println("Commands "+ Commands);
		
		System.out.println("History limit : 3");
		
		if(Commands.size() > 3){
			String action = Commands.poll();
			System.out.println("Limit reached removing oldes command "+ action);
		}
		
		System.out.println("Recent commands: "+ Commands);
		
	}
}