class MathOperation{
	static int a = 30;
	static int b = 40;
	
	static void m1(){
		System.out.println("Executing : m1()");
		
	}
	
	static void m3(){
		System.out.println("Executing : m3()");
		
	}
	
}

class MathOperationsDemo{
	static int x = 10;
	static int y = 20;
	int z =30;
	
	static void m2(){
		System.out.println("Executing : m2()");
		
	}
	
		public static void main(String args[]){
			
			System.out.println(x);
			System.out.println(y);
			//System.out.println(p);
			
			//MathOperationsDemo m1 = new MathOperationsDemo();
			//System.out.println(m1.z);
			System.out.println(MathOperation.a);
			System.out.println(MathOperation.b);
			MathOperation.m1();
			m2();
			MathOperationsDemo.m2();
			System.out.println("Done !!!");
			
	
	
	}
	int p = 50;
	
	
}











