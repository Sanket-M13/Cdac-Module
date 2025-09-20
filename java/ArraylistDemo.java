import java.util.*;
import java.util.Collections;

class ArraylistDemo{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);

		for(int i =0; i< list.size(); i++){
			if(list.get(i) % 2 == 0){
				System.out.println(list.get(i));
			}
		}
		
		Collections.sort(list);
		System.out.println(list);

	}
}