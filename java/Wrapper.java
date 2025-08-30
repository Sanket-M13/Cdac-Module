

class Wrapper{
	
	
		public static void main(String args[]){
			
			int num = 100; // 4bytes
			double d = num; // 8bytes : Widening/Implicit/Upcasting
			
			System.out.println(d);
			
			double num1 = 100.34560; // 8bytes
			long l1 = (long)num1; // 8bytes : Narrowing/Explicit/Downcasting
			
			System.out.println(l1);
			
			int a =10;//Primitive
			Integer i1 = Integer.valueOf(a);// AutoBoxing (Explicit)
			System.out.println(i1);
			
			Integer i11 = 20; //Wrapper class
			int num2 = i11.intValue();
			System.out.println(num2);
			
	
		
	}
	
	
}











