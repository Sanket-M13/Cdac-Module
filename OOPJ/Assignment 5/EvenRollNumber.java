import java.util.*;
class EvenRollNumber{
	public static void main(String args[]){
		List<Integer> num = new ArrayList<>(Arrays.asList(101, 102, 103, 104));
		
		System.out.println("Original Roll Numbers: " + num);
	
		
		num.removeIf(n -> n % 2 != 0);
		
		System.out.println(num);
	}
}
