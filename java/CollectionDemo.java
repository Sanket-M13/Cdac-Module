import java.util.*;
class CollectionDemo{
	public static void main(String args[]){
		
		List a1 = new ArrayList();
		
		a1.add(123);
		a1.add("ABC");
		a1.add(123.255);
		
		List a2 = new ArrayList();
		
		a2.add(124);
		a2.add("ABC");
		a2.add(1235);
		
		a1.retainAll(a2);
		System.out.println(a1);
		System.out.println(a2);
		
		for(Object a: a2){
			System.out.println(a);
			
		}
		Object obj = a2.get(1);
		System.out.println(obj);
		
		Iterator it = a2.iterator();
		Object obj1 = it.next();
		a2.set(1,"111");
		System.out.println(obj1);
	
		while(it.hasNext()){
			System.out.print(" "+it.next());
			
		}
		
		Collections.sort(a2);
		System.out.println(a2);
		
		
	}
}