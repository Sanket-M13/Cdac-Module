import java.util.*;

class TreeSetDemo{
    public static void main(String args[]) {
        Set<String> sets = new TreeSet<>();

        sets.add("Zara");
        sets.add("Aman");
        sets.add("Neha");

        System.out.println(sets);
		
		sets.remove("Neha");
		
		System.out.println(sets);
    }
}
