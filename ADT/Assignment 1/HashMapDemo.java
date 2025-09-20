import java.util.*;

class HashMapDemo{
    public static void main(String args[]) {
        Map<Integer,String> books = new HashMap<>();
		
		books.put(205,"Refactoring");
		books.put(101,"Clean_Code");
		books.put(150,"Effective_java");
		
		System.out.println(books);
		
		books.put(1,"Alpha");
		books.put(2,"Beta");
		
		System.out.println(books);
		
		books.put(2,"Beta_2nd_Ed");
		System.out.println(books);
    
	}
}
