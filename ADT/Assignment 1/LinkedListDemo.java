import java.util.*;

class LinkedListDemo{
    public static void main(String args[]) {
        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(0);

        System.out.println(list);
		
		list.set(1,"X");
		
		System.out.println(list);
    }
}
