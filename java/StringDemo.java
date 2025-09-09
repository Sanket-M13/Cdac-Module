class StringDemo{
	public static void main(String args[]){
	
		String s = "  Good ";
		s = s.concat("  Morning  ");
		
		System.out.println(s);
		
		String s1 = "Good";
		String s2 = new String("Good");
		
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.contains(s2));
		
		String text = "Good, welcome to Java programming!";
        boolean containsWord = text.contains("Java");
		
		System.out.println(containsWord);
		
		s1 = "ABCDE";

		String s7 = "A";//error

		String s8 = "A";

		String s9 = "A";//--> Creates new BC in scp and new s9 point to that

		String s10 = s8 + s9;  //s10 is reference
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(1));
		System.out.println(text.substring(3,15));
		System.out.println(s1.contains(text));
		
		StringBuilder sb = new StringBuilder("Cdac Mumbai");
		sb.append(" Kharghar");
		System.out.println(sb);
		
		Object num = 5;
		// Integer n1 = num;
		// System.out.println(typeOf(num));
		System.out.println(num.getClass().getName());
	}
}

