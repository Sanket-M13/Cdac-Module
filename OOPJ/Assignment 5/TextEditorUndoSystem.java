import java.util.*;
class TextEditorUndoSystem{
	public static void main(String args[]){
		Stack<String> action = new Stack<>();
		
		action.push("Type A");
		action.push("Type B");
		action.push("Delete");
		
		System.out.println("Actions: "+ action);
		
		System.out.println("Undoing last action");
		
		String undoing = action.pop();
		
		System.out.println("Current Actions: "+ action);
		
	}
}