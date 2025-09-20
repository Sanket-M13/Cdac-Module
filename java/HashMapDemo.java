import java.util.*;

public class HashMapDemo{
	
	public static void main(String args[]){
		Map<String,Integer> map = new HashMap<>();
		
		map.put("S",12);
		map.put("A", null);
        map.put("K", 30);
		
		System.out.println(map);
		
		Set<Map.Entry<String,Integer>> entry = map.entrySet();
		
		for(Map.Entry<String,Integer> e: map.entrySet()){
			
			System.out.println(e.getKey()+ ":"+ e.getValue());
		}
		
		Iterator<Map.Entry<String, Integer>> it = entry.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> en = it.next(); // Get the current entry
            System.out.println("Key: " + en.getKey() + ", Value: " + en.getValue());
        }
	}
}