import java.util.*;

class LinkedHashMapDemo{
    public static void main(String args[]) {
        Map<String,String> Linkedhash = new LinkedHashMap<>();
		
		Linkedhash.put("alice", "a1");
		Linkedhash.put("bob", "b1");
		
		System.out.println(Linkedhash);
		
		Linkedhash.put("alice", "a2");
		System.out.println("Updated:"+Linkedhash);
    
	}
}